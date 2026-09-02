# Write your MySQL query statement below
SELECT name
FROM Employee E
JOIN (
    SELECT managerId
    FROM Employee
    GROUP BY managerId
    HAVING COUNT(managerId) >= 5
) J on E.id = J.managerId
;