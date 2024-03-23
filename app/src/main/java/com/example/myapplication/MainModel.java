package com.example.myapplication;

public class MainModel {
    String name,brand,type,price,gurl;

    MainModel(){


    }

    public MainModel(String name, String brand, String type, String price, String gurl) {
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.gurl = gurl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice()
    {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getGurl() {
        return gurl;
    }

    public void setGurl(String gurl) {
        this.gurl = gurl;
    }
}
