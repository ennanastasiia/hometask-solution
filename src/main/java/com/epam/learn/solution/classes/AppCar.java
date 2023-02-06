package com.epam.learn.solution.classes;
import com.epam.learn.solution.classes.vehicles.Car;
import java.util.Arrays;
import java.util.List;


public class AppCar {
    static List<Car> carsList = Arrays.asList(
            new Car(1, "TOYOTA", "PRIUS", 2022, "white", 22000, 2635),
            new Car(2, "TOYOTA", "PRIUS", 2020, "white", 22000, 2635),
            new Car(3, "TOYOTA", "COROLLA", 2020, "black", 21550, 1258),
            new Car(4, "VOLKSWAGEN", "ATLAS", 2022, "blue", 38000, 1111),
            new Car(5, "VOLKSWAGEN", "JETTA", 2022, "grey", 28000, 4856),
            new Car(6, "TESLA", "MODEL S", 2023, "grey", 152200, 3695),
            new Car(7, "RENO", "LAGUNA", 1990, "gold", 2500, 4728),
            new Car(8,"AUDI", "RS Q3",2005, "black", 8000, 3302 ),
            new Car(9,"AUDI", "TT RS", 2011,"red", 6500, 8766),
            new Car(10, "MERCEDES", "SLC", 2009, "gray", 15000, 5563),
            new Car(11, "NISAN", "X-TERRA", 2007, "yellow", 6000,1212)


    );
    public static void main(String[] args) {
        CarLogic carLogic = new CarLogic();
        carLogic.getListSpecifiedBrand(carsList);
        carLogic.getListCarsGivenYearOperation(carsList);

    }
}
