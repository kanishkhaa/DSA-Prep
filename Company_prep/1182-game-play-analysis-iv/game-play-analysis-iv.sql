SELECT 
    ROUND(
        COUNT(*) * 1.0 / (SELECT COUNT(DISTINCT player_id) FROM Activity),
        2
    ) AS fraction
FROM (
    SELECT player_id
    FROM Activity a
    GROUP BY player_id
    HAVING MIN(event_date) + INTERVAL 1 DAY IN (
        SELECT event_date 
        FROM Activity 
        WHERE player_id = a.player_id
    )
) t;