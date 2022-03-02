# Java 07: Inheritance

# Challenge
## Hanging around!
In order to practice inheritance, you will need to create the following classes:

- Create an abstract class Vehicle.

- Add the attributes String brand and int kilometers.

- Create a constructor to initialise brand and kilometers.

- Add getters and setters for all attributes, while also respecting the syntax conventions.

- Create a Car class that extends the Vehicle class.

- Create a Boat class that also extends the Vehicle class.

- Inside Vehicle add the abstract method public String doStuff().

- Inside Car and Boat add an implementation of the body of the method doStuff(). For Car, you will need to refer back to: "I am {brand} and I go zoom zoom zoom!" and for Boat: "I am {brand} and I go glug glug!".

- Create a Hangar class that will have a main() method.

- Add references to instances of the Car and Boat classes in the main() method of Hangar.

- For each of the references, display the result of calling the doStuff() method in the terminal.

- Compile and test Hangar: once everything is working, create a git repository and add it all to GitHub.

- Submit a link to your GitHub repository as the solution.

Example of the expected result when running Hangar:

- I'm Clio and I go zoom zoom zoom!
- I'm Queen Elizabeth 2 and I go glug glug!

## Validation criterias
- The GitHub repository contains the files Vehicle.java, Car.java, Boat.java and Hangar.java.
- Classes follow the OOP naming conventions for private attributes, the this keyword, and getters and setters.
- References to instances of the Car and Boat class are present in the Hangar class.
- The Hangar class compiles with no errors and displays the expected result in the terminal.