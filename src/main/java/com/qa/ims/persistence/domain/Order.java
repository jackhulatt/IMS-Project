package com.qa.ims.persistence.domain;

public class Order {
    private Long id;

    private String customerID;

    private String orderDate;

    private String orderPrice;

    public Order(String customerID, String orderDate, String orderPrice) {
        this.setCustomerID(customerID);
        this.setOrderDate(orderDate);
        this.setOrderPrice(orderPrice);
    }
    public Order(Long id, String customerID, String orderDate, String orderPrice) {
        this.setId(id);
        this.setCustomerID(customerID);
        this.setOrderDate(orderDate);
        this.setOrderPrice(orderPrice);
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }
    @Override
    public String toString() {
        return "id:" + id + " customer ID:" + customerID + " order date:" + orderDate + " order price:" + orderPrice;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((customerID == null) ? 0 : customerID.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
        result = prime * result + ((orderPrice == null) ? 0 : orderPrice.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Order other = (Order) obj;
        if (getCustomerID() == null) {
            if (other.getCustomerID() != null)
                return false;
        } else if (!getCustomerID().equals(other.getCustomerID()))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (orderDate == null) {
            if (other.orderDate != null)
                return false;
        } else if (!orderDate.equals(other.orderDate))
            return false;
        if (orderPrice == null) {
            if (other.orderPrice != null)
                return false;
        } else if (!orderPrice.equals(other.orderPrice))
            return false;
        return true;
    }
}
