package com.example.productspringboot.model;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; private String nameProduct;
    private String vendor;

    public Product() {
    }

    public Product(String nameProduct, String vendor) {
        this.nameProduct = nameProduct;
        this.vendor = vendor;
    }

    @Override
    public String toString() {
        return String.format("Product[id=%d, nameProduct='%s', vendor='%s']", id, nameProduct, vendor);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
}
