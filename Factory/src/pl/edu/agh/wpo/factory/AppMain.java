package pl.edu.agh.wpo.factory;

/**
 * Created by Вадим on 19/10/2016.
 */
public class AppMain {


    public static void main(String[] args) {
        int type;

        OraclDB oracl;
        MSSQLDB mssql;
        MySQLDB mysql;

        if (type == 0){
             oracl = new OraclDB();
        }
        if (type == 1) {
            mssql = new MSSQLDB();
        }
        if (type == 2){
            mysql = new MySQLDB();
        }

        if (type == 0){
            oracl.execute();
        }
        if (type == 1) {
            mssql.execute();
        }
        if (type == 2){
            mysql.execute();
        }

    }
}

