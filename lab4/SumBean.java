package lab4;
import java.io.Serializable;
public class SumBean implements Serializable{
    private int number1;
    private int number2;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getSum() {
        return number1 + number2;
    }
}
