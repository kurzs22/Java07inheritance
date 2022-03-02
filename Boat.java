public class Boat extends Vehicle {
    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

    public String doStuff() {
        String output = "I am " + brand + " and I go glug glug!";
        return output;
    }
}