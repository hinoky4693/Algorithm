# Write your MySQL query statement below

SELECT originRID AS id, count(*) AS num
FROM(
    SELECT requester_id fakeRID, requester_id AS originRID
    FROM RequestAccepted 
    UNION ALL
    SELECT accepter_id fakeAID, accepter_id AS originAID
    FROM RequestAccepted
) TEMPTABLE
GROUP BY originRID
ORDER BY num desc
LIMIT 1
;