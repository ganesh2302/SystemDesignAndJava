package CreationalDesignPattern.Singleton;

public class DBConnectionLazy {

    //initialize it only when its object required.
    private static DBConnectionLazy dbConn = null;
    private DBConnectionLazy(){

    }
    public static DBConnectionLazy getInstance(){
        if(dbConn == null){
            dbConn = new DBConnectionLazy();
            return dbConn;
        }else return dbConn;
    }

}
