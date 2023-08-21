create schema online_store;

create table products(
    product_id int primary key not null auto_increment,
    product_name char(255)
);

create table customers(
    customer_id int primary key not null auto_increment ,
    customer_name char(255)
);

create table orders(
    order_id int primary key not null auto_increment ,
    customer_id int not null ,
    product_id int not null ,
    order_date date not null ,
    amount_spent double ,
    foreign key (customer_id) references customers(customer_id),
    foreign key (product_id) references products(product_id)
);
