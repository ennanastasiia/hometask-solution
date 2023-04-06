package com.epam.learn.solution.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Train implements Transport {
    private final List<PassengerCar> passengerCars;

    public Train(List<PassengerCar> passengerCars) {
        this.passengerCars = passengerCars;
    }

    public List<PassengerCar> getPassengerCars() {
        return passengerCars;
    }

    public int getPassengersCapacity() {
        int totalCapacity = 0;
        for (PassengerCar car : passengerCars) {
            totalCapacity += car.getPassengerCapacity();
        }
        return totalCapacity;
    }

    public int getLuggageCapacity() {
        int totalCapacity = 0;
        for (PassengerCar car : passengerCars) {
            totalCapacity += car.getLuggageCapacity();
        }
        return totalCapacity;
    }

    public int getComfortLevel() {
        int totalComfortLevel = 0;
        for (PassengerCar car : passengerCars) {
            totalComfortLevel += car.getComfortLevel();
        }
        return totalComfortLevel / passengerCars.size();
    }

    public void sortByComfortLevel() {
        passengerCars.sort(Comparator.comparingInt(PassengerCar::getComfortLevel));
    }

    public List<PassengerCar> getPassengerCarsByCapacityRange(int minCapacity, int maxCapacity) {
        List<PassengerCar> result = new ArrayList<>();
        for (PassengerCar car : passengerCars) {
            if (car.getPassengerCapacity() >= minCapacity && car.getPassengerCapacity() <= maxCapacity) {
                result.add(car);
            }
        }
        return result;
    }
}