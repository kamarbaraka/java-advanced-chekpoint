select c.customer_name, o.order_date, o.total_amount_spent from customers c
join orders o on c.customer_id = o.customer_id where c.customer_id = 123
order by o.order_date desc ;