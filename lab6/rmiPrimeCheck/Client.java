import java.rmi.*;
import java.net.*;
import java.util.*;

public class Client {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = sc.nextInt();
        Prime p1 = (Prime) Naming.lookup("rmi://localhost/Prime");
        if (p1.isPrime(x)) {
            System.out.println(x + " is a prime number.");
        } else {
            System.out.println(x + " is a composite number.");
        }
    }
}
