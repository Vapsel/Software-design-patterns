package pl.edu.agh.wpo.factory;

import pl.edu.agh.wpo.factory.abstractmethod.DataBaseCommand;
import pl.edu.agh.wpo.factory.abstractmethod.MySQLCommand;
import pl.edu.agh.wpo.factory.abstractmethod.OraclCommand;

/**
 * Abstract Factory: (factory of factories)
 * products - rodzina obiektów do tworzenia.
 * Te obiekty implementują wspólne interfejsy (Button, Input, Window).
 * Struktura jest symetryczna dla każdej rodziny
 *
 *
 * Dependency inversion stosuje się przy tworzeniu factory method
 */
public class AppMain {


    public static void main(String[] args) {
        // Wykorzystanie factory method
        DataBaseCommand dataBaseCommand = new MySQLCommand();
        dataBaseCommand.executeCommand();

//        DataBaseCommand dataBaseCommand = new MySQLCommand();
//        dataBaseCommand.executeCommand();
    }
}

