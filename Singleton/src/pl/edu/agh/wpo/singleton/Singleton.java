package pl.edu.agh.wpo.singleton;

/**
 *
 */
public class Singleton {

    private static class Wrapper{
        // Na pewno ladowane tylko raz
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
