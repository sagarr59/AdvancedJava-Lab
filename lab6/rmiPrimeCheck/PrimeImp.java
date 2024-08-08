import java.rmi.*;
import java.rmi.server.*;

public class PrimeImp extends UnicastRemoteObject implements Prime {
    public PrimeImp() throws RemoteException {
        super();
    }

    public boolean isPrime(int x) {
        if (x <= 1) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
