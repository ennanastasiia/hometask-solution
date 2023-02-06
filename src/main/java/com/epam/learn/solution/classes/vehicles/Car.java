package com.epam.learn.solution.classes.vehicles;
import java.util.Objects;

public class Car {
    private final int id;
    private final String  brand;
    private final String model;
    private final int year;
    private String color;
    private int price;
    private int registrationNumber;
    public Car(int id, String brand, String model, int year, String color, int price, int registrationNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", registrationNumber=" + registrationNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && year == car.year
                && price == car.price
                && registrationNumber == car.registrationNumber
                && Objects.equals(brand, car.brand)
                && Objects.equals(model, car.model)
                && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, year, color, price, registrationNumber);
    }
}
