package pl.edu.agh.wpo.factory;

/**
 * abstarct - żeby nie tworzyć obiektu tej klasy
 */
abstract public class DataBaseFactory {

    public static final int ORACLE = 0;
    public static final int MSSQL = 1;
    public static final int MYSQL = 2;

    // Te if'y możemy zastapić bardziej rozbudowaną hirerchiją klas
    public static DataBase create(int type){
        if (type == ORACLE){
            return new OraclDB();
        }
        if (type == MSSQL) {
            return new MSSQLDB();
        }
        if (type == MYSQL){
            return new MySQLDB();
        }
        return null;
    }
}
