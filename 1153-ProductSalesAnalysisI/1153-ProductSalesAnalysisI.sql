-- Last updated: 8/11/2026, 2:19:35 PM
# Write your MySQL query statement below
SELECT
    p.product_name,
    s.year,
    s.price
FROM Sales s
JOIN Product p
ON s.product_id = p.product_id;