create trigger update_stock_after_order
after insert on orders
for each row
begin
    update products
        set stock_quantity = stock_quantity - NEW.quantity
    where product_id = NEW.product_id;
end;