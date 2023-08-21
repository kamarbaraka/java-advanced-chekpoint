DELETE FROM customers
WHERE customer_id IN (
    SELECT c.customer_id
    FROM customers c
    LEFT JOIN orders o ON c.customer_id = o.customer_id
    WHERE o.order_date IS NULL OR o.order_date < DATE_SUB(NOW(), INTERVAL 1 YEAR)
);