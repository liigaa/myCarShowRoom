import cars.Car;
import cars.ShoeRoom;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    ShoeRoom shoeRoom = new ShoeRoom();
    public static void main(String[] args) {
Main main = new Main();
main.shoeMenu();
    }

    void shoeMenu() {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        do {
            System.out.println("\nWelcome to the showroom, please choose an activity: ");
            System.out.println("1. Add Car");
            System.out.println("2. View All Cars");
            System.out.println("3. View Single Car");
            System.out.println("4. Remove Car");
            System.out.println("\nEnter Quit to end program...");
            System.out.println("Choose a number");
            userInput = scanner.nextLine();

            switch (userInput) {
                case "Quit":
                    System.out.println("Exiting Application...");
                    break;
                case "1":
                    addCar();
                    break;
                case "2":
                    viewAllCars();
                    break;
                case "3":
                    viewSingleCar();
                    break;
                case "4":
                    removeCar();
                    break;
                default:
                    break;

            }
        } while (!userInput.equalsIgnoreCase("Quit"));
        return;
    }
    void addCar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add Car");
        Car car = new Car();
        System.out.println("Enter Name:");
        car.name = scanner.nextLine();
        System.out.println("Enter Manufacturer: ");
        car.manufacture = scanner.nextLine();
        System.out.println("Enter Type: ");
        car.type = scanner.nextLine();
        car.id = UUID.randomUUID();
        String message = shoeRoom.addCar(car);
        System.out.println(message);
    }
    void  viewAllCars(){
        ArrayList<Car> allCars= shoeRoom.getAllCars();
        System.out.println("\nAll Available Cars\n");
        System.out.println("Car Name\t Manufacturer\t Car Type");
        for (Car car: allCars) {
            System.out.println(car.name + "\t" + car.manufacture + "\t" + car.type);
        }
    }
    void viewSingleCar(){

       Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a car number to see");
        int carId;
        carId = scanner.nextInt();
        String message = shoeRoom.getSingleCar(carId);
        System.out.println(message);
        //System.out.println("Car Number: " + car.id);
        //System.out.println("Car name: " + car.name);

    }
    void removeCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a car to remove");
        int carId = scanner.nextInt();
       String message = shoeRoom.removeCar(carId);
       System.out.println(message);

    }
    //This is a comment made on the remote server!
    
    //I will try again
}
