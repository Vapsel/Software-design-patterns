package pl.edu.agh.wpo.decorator;

/**
 * Created by Vadym on 11/16/2016.
 */
public abstract class DoubleDecorator implements Number{

    protected Number number;

    @Override
    public double calculate() {
        return number.calculate();
    }
}
