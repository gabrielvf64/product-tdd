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
}
