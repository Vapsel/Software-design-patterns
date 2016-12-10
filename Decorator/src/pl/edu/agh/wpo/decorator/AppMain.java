package pl.edu.agh.wpo.decorator;

/**
 * Created by Vadym on 11/16/2016.
 */
public class AppMain {

    public static void main(String[] args) {
        // Mamy dużo new
        Number number = new Substraction(new Addition(new DoubleN(3), new Sqrt(new DoubleN(4))), new DoubleN(2));
        System.out.println(number.calculate());
    }
}
