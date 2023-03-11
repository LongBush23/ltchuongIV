package KeThua;

/**
 *
 * @author VQ
 */
public class Vehicle {
  String color;
  String model;

  public void run() {
    System.out.println("Vehicle is running.");
  }
}

class Bicycle extends Vehicle {
  public Bicycle(String color, String model) {
    this.color = color;
    this.model = model;
  }

  public void run() {
    System.out.println("Bicycle is running.");
  }
}

class Car extends Vehicle {
  public Car(String color, String model) {
    this.color = color;
    this.model = model;
  }

  public void run() {
    System.out.println("Car is running.");
  }
}

class Main {
  public static void main(String[] args) {
    Bicycle bicycle = new Bicycle("Red", "BMX");
    Car car = new Car("Blue", "Toyota");

    bicycle.run();
    car.run();
  }
}



}
