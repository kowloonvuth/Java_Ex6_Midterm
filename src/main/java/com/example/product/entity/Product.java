package com.example.product.entity;

public class Product {
    private Long id;
    private String name;
    private double pricePerUnit;
    private boolean activeForSell;

    // Constructors, getters, and setters
    public Product() {
    }

    public Product(Long id, String name, double pricePerUnit, boolean activeForSell) {
        this.id = id;
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.activeForSell = activeForSell;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public boolean isActiveForSell() {
        return activeForSell;
    }

    public void setActiveForSell(boolean activeForSell) {
        this.activeForSell = activeForSell;
    }
}