# Write your MySQL query statement below
SELECT COALESCE(
    (SELECT num FROM MyNumbers  GROUP BY num  HAVING COUNT(num) = 1 OR COUNT(num) = 0 ORDER BY num DESC LIMIT 1),
    null
) as num ;