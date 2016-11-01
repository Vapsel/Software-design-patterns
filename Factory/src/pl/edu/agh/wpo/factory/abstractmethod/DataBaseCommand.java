package pl.edu.agh.wpo.factory.abstractmethod;

import pl.edu.agh.wpo.factory.DataBase;

/**
 * Created by Vadym on 10/26/2016.
 */
public abstract class DataBaseCommand {

    protected DataBase dataBase;

    public abstract void prepareCommand();

    public void executeCommand(){
        prepareCommand();
        dataBase.connect();
        dataBase.execute();
        dataBase.disconnect();
    }

}
