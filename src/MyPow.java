/**
 * Created by 刘灿锐 on 2017/2/26 0026.
 * Implement pow(x, n).
 */
public class MyPow {
    public double myPow(double x, int n) {
        double temp;
        if (n == 0)
            return 1;
        temp = myPow(x, n / 2);
        if (n % 2 == 0)
            return temp * temp;
        else {
            if (n > 0)
                return x * temp * temp;
            else
                return (temp * temp) / x;
        }
    }
}
