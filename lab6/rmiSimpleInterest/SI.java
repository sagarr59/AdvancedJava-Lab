import java.rmi.*;

public interface SI extends Remote {
    public double calcSI(double p, double r, int t) throws RemoteException;
}
