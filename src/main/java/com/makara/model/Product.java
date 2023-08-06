package com.makara.model;

import org.springframework.stereotype.Component;

@Component
public class Product {
    public int id;
    public String name;
    public double price;
    public String image;
    public Enum type;

    public Product(int id, String name, double price, String image, Enum type) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Enum getType() {
        return type;
    }

    public void setType(Enum type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

}
