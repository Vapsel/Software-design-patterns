package pl.edu.agh.wpo.factory;

/**
 * Created by Вадим on 19/10/2016.
 */
public class OraclDB implements DataBase {

    private String name = "Oracle";

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
