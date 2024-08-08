import java.net.*;
import java.rmi.*;
import java.util.*;

public class Client {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount:");
        double p = sc.nextDouble();
        System.out.println("Enter rate of interest:");
        double r = sc.nextDouble();
        System.out.println("Enter time period in years:");
        int t = sc.nextInt();

        SI si = (SI) Naming.lookup("rmi://localhost/SIService");
        double interest = si.calcSI(p, r, t);
        System.out.println("Simple Interest = " + interest);
    }
}
