/**
 * Ma szansa stać obiektem Bogiem
 * Dzielimy system na kilka fasad, żeby łatwiej było używać
 */
public class Fasada {

    private Cisnieniomerz cisnieniomerz;
    private Klimatyzacja klimatyzacja;
    private Swiatla swiatla;
    private Termometr termometr;

    public Fasada(Cisnieniomerz cisnieniomerz, Klimatyzacja klimatyzacja, Swiatla swiatla, Termometr termometr) {
        this.cisnieniomerz = cisnieniomerz;
        this.klimatyzacja = klimatyzacja;
        this.swiatla = swiatla;
        this.termometr = termometr;
    }

    public void run(){
        while(true){
            System.out.println(cisnieniomerz.read());
            System.out.println(klimatyzacja.read());
            System.out.println(swiatla.read());
            System.out.println(termometr.read());
        }
    }
}
