public class Hangar {
    public static void main(String[] args) {
        Vehicle clio = new Car("Clio", 123456);
        Vehicle qe2 = new Boat("Queen Elizabeth 2", 4123000);

        System.out.println(clio.doStuff());
        System.out.println(qe2.doStuff());
    }
}