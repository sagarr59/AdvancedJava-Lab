package lab4;

public class MainImplicit {
    public static void main(String[] args) {
        // Creating an instance of Person using the default no-argument constructor
        PersonImp person = new PersonImp();

        // Setting the name property using setter method
        person.setName("Sagar Raut");

        // Getting the name property using getter method
        System.out.println("Implicit call with name: " + person.getName());
    }
}
