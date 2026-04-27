-- select e.name, b.bonus from Employee e left join Bonus b on e.empId = b.empId
-- where b.bonus < 1000 or b.bonus IS NULL;

select e.name, b.bonus from Employee e 
left join Bonus b on e.empID = b.empID
where e.empID NOT IN  (
    select empID from Bonus 
)
OR bonus<1000;
