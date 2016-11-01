package pl.edu.agh.wpo.factory;

/**
 *
 */
public interface DataBase {
    void connect();
    void execute();
    void disconnect();
}
