package pl.edu.agh.wpo.singleton;

/**
 * Stara wersia wzorca. Uzywany wzorzec Lazy Load.
 * Stosowanie: cache. Tworzenie nowego obiektu -> strata wszystkich danych.
 */
public class SingletonOld {
    private static SingletonOld instance;

    // Zwracamy na rzadanie. Synchronizacja przy tworzenia obiektow
    synchronized public static SingletonOld getInstance(){
        // Na poczatku jest nullem
        if (instance == null){
            // Dwa watki moge tu wejsc na raz i wszystko popsuc -> dwa razy wykona sie tworzenie obiektu
            instance = new SingletonOld();
        }
        return instance;
    }
}
