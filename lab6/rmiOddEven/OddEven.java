import java.rmi.*;

public interface OddEven extends Remote {
    public String checkOddEven(int number) throws RemoteException;
}
