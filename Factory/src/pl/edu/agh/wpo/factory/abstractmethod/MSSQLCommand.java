package pl.edu.agh.wpo.factory.abstractmethod;

import pl.edu.agh.wpo.factory.MSSQLDB;

/**
 * Created by Vadym on 10/26/2016.
 */
public class MSSQLCommand extends DataBaseCommand {

    @Override
    public void prepareCommand() {
        dataBase = new MSSQLDB();
    }
}
