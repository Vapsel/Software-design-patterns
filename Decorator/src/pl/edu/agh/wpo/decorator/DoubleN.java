package pl.edu.agh.wpo.decorator;

/**
 * Klasa A z nonatek
 */
public class DoubleN implements Number {

    private double value;

    public DoubleN(double value) {
        this.value = value;
    }

    @Override
    public double calculate(){
        return value;
    }
}
