create database if not exists `ims`;
use `ims`;


create table if not exists `customers` (
    `customer_id` int not null auto_increment,
    `customer_name` varchar(50) not null,
    `customer_surname` varchar(50) not null,
    `email` varchar(100),
    `postcode` varchar(8),
    `house number / name` varchar(100),
    PRIMARY KEY (`customer_id`)
);

create table if not exists `orders` (
    `order_id` int not null auto_increment,
    `customer_id` int not null,
    `order_date` date,
    `order_arrivalDate` date,
    `order_price` double,
    PRIMARY KEY (`order_id`),
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

create table if not exists `items` (
    `item_id` int not null auto_increment,
    `item_name` varchar(50) not null,
    `item_stock` int default null,
    `item_description` varchar(255),
    `item_price` double,
    PRIMARY KEY (`item_id`)
);

create table if not exists `order_info` (
    `order_info_id` int not null auto_increment,
    `order_id` int not null,
    `item_id` int not null,
    `order_quantity` int default null,
    PRIMARY KEY(`order_info_id`),
    FOREIGN KEY (order_id) REFERENCES orders(order_id),
    FOREIGN KEY (item_id) REFERENCES items(item_id)
);