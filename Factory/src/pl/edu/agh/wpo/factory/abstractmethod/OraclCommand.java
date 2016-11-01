package pl.edu.agh.wpo.factory.abstractmethod;

import pl.edu.agh.wpo.factory.OraclDB;

/**
 * Ta klasa odpowiada za implementacje konkretnej bazy danych
 */
public class OraclCommand extends DataBaseCommand{

    @Override
    public void prepareCommand() {
        dataBase = new OraclDB();
    }
}
