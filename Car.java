public class Car extends Vehicle {
    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    public String doStuff() {
        String output = "I am " + brand + " and I go zoom zoom zoom!";
        return output;
    }

}