package week03;


abstract class Vehicle {
    public abstract void startEngine();
    public abstract void stopEngine();
}

class Cars extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Cars starting with a key.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Cars  stopping with a key.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Bike  starting with a button.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle  stopping with a button.");
    }
}
public class wn03 {
public static void main(String[] args) {
	Cars car = new Cars();
    car.startEngine();
    car.stopEngine();

    Motorcycle motorcycle = new Motorcycle();
    motorcycle.startEngine();
    motorcycle.stopEngine();
}
}
