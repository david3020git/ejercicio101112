package com.example.ejercicio101112.entities;

import javax.persistence.*;

@Entity
@Table(name = "Laptops")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Double price;


    //construcores


    public Laptop() {
    }

    public Laptop(Long id, String title, Double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }


    //metodos setter y getters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    //toString


    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

}
