select product_id , year as first_year, quantity, price
from (
    select * ,
    RANK() OVER (partition by product_id order by year) as rnk
    from Sales 
) t
where rnk = 1;