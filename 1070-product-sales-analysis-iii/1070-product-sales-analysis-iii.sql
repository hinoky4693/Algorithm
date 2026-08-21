# Write your MySQL query statement below

SELECT S.product_id, s.year as first_year, quantity, price
FROM Sales S
JOIN (
    SELECT PRODUCT_ID, MIN(YEAR) AS YEAR
    FROM SALES
    GROUP BY PRODUCT_ID
) J ON S.PRODUCT_ID = J.PRODUCT_ID
WHERE S.YEAR = J.YEAR

-- SELECT * FROM SALES WHERE PRODUCT_ID = 34 AND YEAR = 1804
;