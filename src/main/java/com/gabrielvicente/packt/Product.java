package com.gabrielvicente.packt;

import lombok.Data;

@Data
public class Product {
    private Integer id;
    private String name;
    private String description;
    private Float price;

    public Product() {
    }

    public Product(Integer id, String name, String description, Float price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
