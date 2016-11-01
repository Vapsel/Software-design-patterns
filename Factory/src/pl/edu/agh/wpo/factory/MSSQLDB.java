package pl.edu.agh.wpo.factory;

/**
 * Created by Вадим on 19/10/2016.
 */
public class MSSQLDB implements DataBase {

    private String name = "MS SQL";

    @Override
    public void connect() {
        System.out.println(name + "connected");
    }

    @Override
    public void execute() {
        System.out.println(name + "executed");

    }

    @Override
    public void disconnect() {
        System.out.println(name + "disconnected");
    }
}
