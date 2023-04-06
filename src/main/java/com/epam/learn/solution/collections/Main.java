package com.epam.learn.solution.collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PassengerCar car1 = new PassengerCar(50, 1000, 4);
        PassengerCar car2 = new PassengerCar(40, 800, 3);
        PassengerCar car3 = new PassengerCar(30, 600, 2);
        PassengerCar car4 = new PassengerCar(55, 450, 1);
        PassengerCar car5 = new PassengerCar(20, 105, 1);
        PassengerCar car6 = new PassengerCar(48, 880, 3);
        PassengerCar car7 = new PassengerCar(60, 900, 4);

        List<PassengerCar> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);

        Train train = new Train(cars);
        System.out.println("Total passengers capacity: " + train.getPassengersCapacity());
        System.out.println("Total luggage capacity: " + train.getLuggageCapacity());
        System.out.println("Average comfort level: " + train.getComfortLevel());

        train.sortByComfortLevel();
        System.out.println("Sorted passenger cars by comfort level: " + train.getPassengerCars());

        List<PassengerCar> carsInRange = train.getPassengerCarsByCapacityRange(10, 40);
        System.out.println("Passenger cars with capacity in range 10-40: " + carsInRange);
    }
}
