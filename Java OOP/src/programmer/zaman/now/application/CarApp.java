package programmer.zaman.now.application;
import programmer.zaman.now.annotation.Fancy;
import programmer.zaman.now.data.Avanza;
import programmer.zaman.now.data.Car;

@Fancy(name = "AnimalApp", tage = {"application", "java"})      // Ini Annotation
public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
    }
}
