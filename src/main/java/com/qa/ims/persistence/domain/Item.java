package com.qa.ims.persistence.domain;

public class Item {

    private Long id;

    private String itemName;

    private String itemStock;

    private String itemDescription;

    private String itemPrice;

    public Item(String itemName, String itemStock, String itemDescription, String itemPrice) {
        this.setItemName(itemName);
        this.setItemStock(itemStock);
        this.setItemDescription(itemDescription);
        this.setItemPrice(itemPrice);

    }

    public Item(Long id, String itemName, String itemStock, String itemDescription, String itemPrice) {
        this.id = id;
        this.itemName = itemName;
        this.itemStock = itemStock;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public String getItemStock() {
        return itemStock;
    }
    public void setItemStock(String itemStock) {
        this.itemStock = itemStock;
    }
    public String getItemDescription() {
        return itemDescription;
    }
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    public String getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }
    @Override
    public String toString() {
        return "id:" + id + " item name:" + itemName + " item stock:" + itemStock + " item description:" + itemDescription + " item price:" + itemPrice;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((itemStock == null) ? 0 : itemStock.hashCode());
        result = prime * result + ((itemDescription == null) ? 0 : itemDescription.hashCode());
        result = prime * result + ((itemPrice == null) ? 0 : itemPrice.hashCode());
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
        Item other = (Item) obj;
        if (getItemName() == null) {
            if (other.getItemName() != null)
                return false;
        } else if (!getItemName().equals(other.getItemName()))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (itemStock == null) {
            if (other.itemStock != null)
                return false;
        } else if (!itemStock.equals(other.itemStock))
            return false;
        if (itemDescription == null) {
            if (other.itemDescription != null)
                return false;
        } else if (!itemDescription.equals(other.itemDescription))
            return false;
        if (itemPrice == null) {
            if (other.itemPrice != null)
                return false;
        } else if (!itemPrice.equals(other.itemPrice))
            return false;
        return true;
    }

}

