SELECT c.category_name, SUM(p.price * o.quantity) AS total_revenue
FROM products p
JOIN orders o ON p.product_id = o.product_id
JOIN categories c ON p.category_id = c.category_id
GROUP BY c.category_name;