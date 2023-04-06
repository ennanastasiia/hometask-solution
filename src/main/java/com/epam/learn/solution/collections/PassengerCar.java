package com.epam.learn.solution.collections;

import java.util.ArrayList;
import java.util.Objects;

public class PassengerCar extends Train {
    private final int passengerCapacity;
    private final int luggageCapacity;
    private final int comfortLevel;

    public PassengerCar(int passengerCapacity, int luggageCapacity, int comfortLevel) {
        super(new ArrayList<>());
        this.passengerCapacity = passengerCapacity;
        this.luggageCapacity = luggageCapacity;
        this.comfortLevel = comfortLevel;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getLuggageCapacity() {
        return luggageCapacity;
    }

    public int getComfortLevel() {
        return comfortLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassengerCar that = (PassengerCar) o;
        return passengerCapacity == that.passengerCapacity && luggageCapacity == that.luggageCapacity && comfortLevel == that.comfortLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengerCapacity, luggageCapacity, comfortLevel);
    }

    @Override
    public String toString() {
        return "\n" +"PassengerCar {" +
                "passengerCapacity = " + passengerCapacity +
                ", luggageCapacity = " + luggageCapacity +
                ", comfortLevel = " + comfortLevel +
                '}';
    }
}

