package lab4;

public class MainExplicit {
    public static void main(String[] args) {
        // Creating an instance of Person using the constructor with argument explicitly
        PersonExp person = new PersonExp("Sagar Raut");

        // Getting the name property using getter method
        System.out.println("Explicit call with name: " + person.getName());
    }
}
