package cars;

import java.util.ArrayList;

public class ShoeRoom {
    private ArrayList<Car> cars = new ArrayList<Car>();

    //addCar
    public String addCar(Car car) {
        this.cars.add(car);
        return car.name + " Added successfully";
    }
    //getAllCar
    public ArrayList<Car> getAllCars(){
        return cars;
    }
    //getSingleCar
//    public Car getSingleCar(int carID) {
//        return this.cars.get(carID);
//    }

    public String getSingleCar (int carID) {
        try {
            Car car = this.cars.get(carID);
            return "Car Number: " + car.id + "\nCar Name: " + car.name + "\nCar Manufacturer: " + car.manufacture + "\nCar Type: " + car.type;
        } catch ( Exception ex) {
            return "Unable to find car. Please try again!";
        }}


    //removeCar // Cars is array list name
    public String removeCar(int carId) {
        try {
            cars.remove(carId);
        } catch (Exception ex) {
            return  "Unable to remove specified car";
        }
        return "car removed successfully";
    }
}
