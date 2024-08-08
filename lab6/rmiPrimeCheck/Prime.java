import java.rmi.*;

public interface Prime extends Remote {
    public boolean isPrime(int x) throws RemoteException;
}
