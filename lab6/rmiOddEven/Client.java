import java.rmi.*;
import java.net.*;
import java.util.*;

public class Client {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        OddEven oe = (OddEven) Naming.lookup("rmi://localhost/OddEvenService");
        String result = oe.checkOddEven(number);
        System.out.println(result);
    }
}
