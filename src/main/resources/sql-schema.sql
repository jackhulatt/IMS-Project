create database if not exists `ims`;
use `ims`;


create table if not exists `customers` (
    `id` int not null auto_increment,
    `first_name` varchar(50) not null,
    `surname` varchar(50) not null,
    PRIMARY KEY (`id`)
);

create table if not exists `orders` (
    `id` int not null auto_increment,
    `customer_id` int not null,
    `order_date` date,
    `order_price` double,
    PRIMARY KEY (`id`),
    FOREIGN KEY (customer_id) REFERENCES customers(id)
);

create table if not exists `items` (
    `id` int not null auto_increment,
    `item_name` varchar(50) not null,
    `item_stock` int default null,
    `item_description` varchar(255),
    `item_price` double,
    PRIMARY KEY (`id`)
);

create table if not exists `order_info` (
    `id` int not null auto_increment,
    `order_id` int not null,
    `item_id` int not null,
    `order_quantity` int default null,
    PRIMARY KEY(`id`),
    FOREIGN KEY (order_id) REFERENCES orders(id),
    FOREIGN KEY (item_id) REFERENCES items(id)
);