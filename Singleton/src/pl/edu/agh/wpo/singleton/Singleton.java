package pl.edu.agh.wpo.singleton;

/**
 *
 */
public class Singleton {

    private static class Wrapper{
        // Na pewno ladowane tylko raz. Ładowane do metespace od Java 1.8; do Java 1.7 ładowane do pregen
        private static Singleton instance = new Singleton();
    }

    // Tylko raz ladowane jezeli ClassLoader dziala w trybie domyslnym
    //private static Singleton instance = new Singleton();

    //Zabiezpieczenie przed tworzeniem wielu obiektow;
    private Singleton() {}

    public static Singleton getInstance() {
        return Wrapper.instance;
    }
}

// Gdzie sa ladowane kody klas i zmienne statyczne
// stos, sterta, metadata - nie!
