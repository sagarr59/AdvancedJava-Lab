import java.rmi.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        PrimeImp p2 = new PrimeImp();
        Naming.rebind("rmi://localhost/Prime", p2);
    }
}
