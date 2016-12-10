package pl.edu.agh.wpo.decorator;

/**
 * Created by Vadym on 11/16/2016.
 */
public class Addition extends DoubleDecorator {

    // Pierwsza liczba w DoubleDecorator
    private Number second;

    public Addition(Number first, Number second) {
        this.number = first;
        this.second = second;
    }

    @Override
    public double calculate() {
        double result;
        result = number.calculate(); // Wywołanie ważnej metody
        result = result + second.calculate(); // Dekoracja waznej metody
        return result;
    }
}
