import java.net.*;
import java.rmi.*;

public class Server {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        SIImpl siImpl = new SIImpl();
        Naming.rebind("rmi://localhost/SIService", siImpl);
    }
}
