// Base class
class Vehicle {
    public void forward() {
        System.out.println("The vehicle is moving forward.");
    }

    public void reverse() {
        System.out.println("The vehicle is moving in reverse.");
    }
}

// SUV subclass
class SUV extends Vehicle {
    @Override
    public void forward() {
        System.out.println("The SUV moves forward with power.");
    }

    @Override
    public void reverse() {
        System.out.println("The SUV reverses carefully.");
    }
}

// SportsCar subclass
class SportsCar extends Vehicle {
    @Override
    public void forward() {
        System.out.println("The sports car accelerates forward rapidly.");
    }

    @Override
    public void reverse() {
        System.out.println("The sports car reverses quickly.");
    }
}

// Hybrid subclass
class Hybrid extends Vehicle {
    @Override
    public void forward() {
        System.out.println("The hybrid moves forward efficiently using electric power.");
    }

    @Override
    public void reverse() {
        System.out.println("The hybrid reverses quietly.");
    }
}

// Test class
public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new SUV();
        Vehicle v2 = new SportsCar();
        Vehicle v3 = new Hybrid();

        v1.forward();
        v1.reverse();

        v2.forward();
        v2.reverse();

        v3.forward();
        v3.reverse();
    }
}