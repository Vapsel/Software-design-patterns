package pl.edu.agh.wpo.decorator;

/**
 * Created by Vadym on 11/16/2016.
 */
public class Sqrt extends DoubleDecorator {

    public Sqrt(Number number) {
        this.number = number;
    }

    @Override
    public double calculate() {
        return Math.sqrt(number.calculate());
    }
}
