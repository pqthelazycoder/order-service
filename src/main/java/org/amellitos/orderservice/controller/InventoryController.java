package org.amellitos.orderservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by rmabini on 8/17/2019.
 */
@RestController
@RequestMapping("/inventory/")
public class InventoryController {

    @RequestMapping(value = "/")
    public String welcome(){
        return "Welcome to Inventory List ";
    }

    @RequestMapping(value = "/list")
    public List<Product> getProductList(){
        List<Product> inventory = Arrays.asList(new Product(Long.valueOf(0), "0001", "Burger", BigDecimal.ZERO, 100));
        return inventory;
    }
}

class Product {
    private Long id;
    private String code;
    private String name;
    private BigDecimal amount;
    private int quantity;

    public Product(Long id, String code, String name, BigDecimal amount, int quantity) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.amount = amount;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(quantity, product.quantity) &&
                Objects.equals(id, product.id) &&
                Objects.equals(code, product.code) &&
                Objects.equals(name, product.name) &&
                Objects.equals(amount, product.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, amount, quantity);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("id=").append(id);
        sb.append(", code='").append(code).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", amount=").append(amount);
        sb.append(", quantity=").append(quantity);
        sb.append('}');
        return sb.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}