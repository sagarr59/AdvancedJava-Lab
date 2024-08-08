import java.rmi.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        OddEvenImpl oeImpl = new OddEvenImpl();
        Naming.rebind("rmi://localhost/OddEvenService", oeImpl);
    }
}
