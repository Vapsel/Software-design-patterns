package pl.edu.agh.wpo.factory.abstractmethod;

import pl.edu.agh.wpo.factory.MySQLDB;

/**
 * Created by Vadym on 10/26/2016.
 */
public class MySQLCommand extends DataBaseCommand {

    @Override
    public void prepareCommand() {
        dataBase = new MySQLDB();
    }
}
