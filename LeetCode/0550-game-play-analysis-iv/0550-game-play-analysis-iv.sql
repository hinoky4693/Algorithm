# Write your MySQL query statement below
-- SELECT COUNT(DISTINCT PLAYER_ID)
-- FROM Activity
-- ;
-- userCount

-- SELECT player_id, min(event_date) as initial_login
-- FROM Activity
-- GROUP BY player_id
-- ;
-- initialLogin

SELECT
    ROUND(COUNT(*) / (
        SELECT COUNT(DISTINCT PLAYER_ID)
        FROM Activity
    ), 2) as fraction
FROM Activity A
JOIN (
    SELECT player_id, min(event_date) as initial_login
    FROM Activity
    GROUP BY player_id
) initLog on A.player_id = initLog.player_id
WHERE A.player_id = initLog.player_id
AND datediff(A.event_date, initLog.initial_login) = 1
;
