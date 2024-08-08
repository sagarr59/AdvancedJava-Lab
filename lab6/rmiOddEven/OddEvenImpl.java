import java.rmi.*;
import java.rmi.server.*;

public class OddEvenImpl extends UnicastRemoteObject implements OddEven {
    public OddEvenImpl() throws RemoteException {
        super();
    }

    public String checkOddEven(int number) {
        if (number % 2 == 0) {
            return number + " is even";
        } else {
            return number + " is odd";
        }
    }
}
