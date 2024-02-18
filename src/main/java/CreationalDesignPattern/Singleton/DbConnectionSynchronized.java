package CreationalDesignPattern.Singleton;

public class DbConnectionSynchronized {

    private static DbConnectionSynchronized dbConn;
    private DbConnectionSynchronized(){

    }
    //thread safe, it puts lock if one thread is already using this method.
    synchronized public static DbConnectionSynchronized getInstance(){
        if(dbConn == null){
            dbConn = new DbConnectionSynchronized();
            return dbConn;
        }else return dbConn;
    }
}
