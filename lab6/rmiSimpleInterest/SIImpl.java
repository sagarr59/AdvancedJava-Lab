import java.rmi.*;
import java.rmi.server.*;

public class SIImpl extends UnicastRemoteObject implements SI {
    public SIImpl() throws RemoteException {
        super();
    }

    public double calcSI(double p, double r, int t) {
        return (p * r * t) / 100;
    }
}
