package org.example.thread.p01thread.stream.p08stream.p05test;

public class Car {

    private String name;
    private String colour;
    private Integer model;

    private Integer price;


    public Car(String name, String colour, Integer model, Integer price) {
        this.name = name;
        this.colour = colour;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", model=" + model +
                ", price=" + price +
                '}';
    }
}
