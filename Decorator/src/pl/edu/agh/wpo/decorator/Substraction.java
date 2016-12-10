package pl.edu.agh.wpo.decorator;

/**
 * Created by Vadym on 11/16/2016.
 */
public class Substraction extends DoubleDecorator {

    private Number second;

    public Substraction(Number first, Number second) {
        this.number = first;
        this.second = second;
    }

    @Override
    public double calculate() {
        return number.calculate() - second.calculate();
    }
}
