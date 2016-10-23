package pl.edu.agh.wpo.observer;

/**
 *
 */
public class AppMain {

    public static void main(String[] args) {
        Subject s = new Subject();

        // Mozna zmieniac implementacje, wiec deklarujemy jako instancje Listener
        Listener l = new Observer();

        s.addListener(l);
        s.doSmth();
    }


}
