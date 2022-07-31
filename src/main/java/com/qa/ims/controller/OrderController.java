package com.qa.ims.controller;

import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class OrderController implements CrudController<Order> {

    public static final Logger LOGGER = LogManager.getLogger();

    private OrderDAO orderDAO;
    private Utils utils;

    public OrderController(OrderDAO orderDAO, Utils utils) {
        super();
        this.orderDAO = orderDAO;
        this.utils = utils;
    }
    @Override
    public List<Order> readAll() {
        List<Order> orders = orderDAO.readAll();
        for (Order order : orders) {
            LOGGER.info(order);
        }
        return orders;
    }
    @Override
    public Order create() {
        LOGGER.info("Please enter the order customer ID");
        String customerID = utils.getString();
        LOGGER.info("Please enter the order date");
        String orderDate = utils.getString();
        LOGGER.info("Please enter the order price");
        String orderPrice = utils.getString();
        Order order = orderDAO.create(new Order(customerID, orderDate, orderPrice));
        LOGGER.info("Order created");
        return order;
    }
    @Override
    public Order update() {
        LOGGER.info("Please enter the id of the order you would like to update");
        Long id = utils.getLong();
        LOGGER.info("Please the customer ID you would like to update");
        String customerID = utils.getString();
        LOGGER.info("Please enter the order date you would like to update");
        String orderDate = utils.getString();
        LOGGER.info("Please enter the order price you would like to update");
        String orderPrice = utils.getString();
        Order order = orderDAO.create(new Order(customerID, orderDate, orderPrice));
        LOGGER.info("Order Updated");
        return order;
    }
    @Override
    public int delete() {
        LOGGER.info("Please enter the id of the order you would like to delete");
        Long id = utils.getLong();
        return orderDAO.delete(id);
    }
}
