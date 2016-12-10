/**
 * Created by Vadym on 11/16/2016.
 */
public class AppMain {

    public static void main(String[] args) {
        Fasada fasada = new Fasada(new Cisnieniomerz(), new Klimatyzacja(), new Swiatla(), new Termometr());
        fasada.run();
    }
}
