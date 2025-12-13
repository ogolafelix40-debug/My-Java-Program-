class Vehicle {
    String brand;
    int year;
}
class Car extends Vehicle{ 
    int seats;
}
public class Automobile{
    public static void main(String[] args){

        Car car = new Car();
        car.brand = "Mercedes";
        car.year = 2018;
        car.seats = 5;

        //Print details
        System.out.println("Brand: " + car.brand);
        System.out.println("Year: " + car.year);
        System.out.println("Seats: " + car.seats);



    }
}