package com.epam.learn.solution.classes;
import com.epam.learn.solution.classes.vehicles.Car;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CarLogic {
    Scanner scanner = new Scanner(System.in);
    private List<Car> cars;
    LocalDate currentDate = LocalDate.now();

    public void getListSpecifiedBrand(List<Car> cars){
        System.out.println("Enter brand car: ");
        List<Car> listSearchBrand = new ArrayList<>();
        String searchBrand = scanner.nextLine();
        if (!searchBrand.isEmpty()){
            for (Car car : cars) {
                if (car.getBrand().contains(searchBrand.toUpperCase())){
                    listSearchBrand.add(car);
                }
            }
        }else System.out.println("Search is empty");

        System.out.println(listSearchBrand);
    }
    public List<Car> getListSpecifiedModel(List<Car> cars){
        System.out.println("Enter model car: ");
        List <Car> listSearchModels = new ArrayList<>();
        String searchModel = scanner.nextLine();
        if (!searchModel.isEmpty()){
            for (Car car : cars) {
                if (car.getModel().contains(searchModel.toUpperCase())){
                    listSearchModels.add(car);
                }
            }
        }
        System.out.println(listSearchModels);
        return listSearchModels;
    }
    public void getListCarsGivenYearOperation(List <Car> cars){
        CarLogic carRent = new CarLogic();
        List<Car> listModel = carRent.getListSpecifiedModel(cars);
        List<Car> searchModelAndYear = new ArrayList<>();
        System.out.println("Enter lifetime: ");
        int searchYear = scanner.nextInt();
        for (Car car : listModel) {
            if (currentDate.getYear() == car.getYear() + searchYear){
                searchModelAndYear.add(car);
            }
        }
        System.out.println(searchModelAndYear);
    }
}
