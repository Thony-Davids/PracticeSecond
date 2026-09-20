package com.example.practicesecond;

public class Products {
    int product_id;
    String product_name;
    String product_description;
    String category;
    int product_stocks;
    int product_price;
    int product_image;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Products(int product_id, String product_name, String product_description, String category, int product_stocks, int product_price, int product_image) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_description = product_description;
        this.category = product_description;
        this.product_stocks = product_stocks;
        this.product_price = product_price;
        this.product_image = product_image;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public int getProduct_stocks() {
        return product_stocks;
    }

    public void setProduct_stocks(int product_stocks) {
        this.product_stocks = product_stocks;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public int getProduct_image() {
        return product_image;
    }

    public void setProduct_image(int product_image) {
        this.product_image = product_image;
    }
}
