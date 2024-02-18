package CreationalDesignPattern.Singleton;

public class DBConnectionEager {
    private static DBConnectionEager dbConn= new DBConnectionEager();

    private DBConnectionEager(){};

    public static DBConnectionEager getInstance(){
        return dbConn;
    }


}
