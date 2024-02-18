package CreationalDesignPattern.Singleton;

public class DBConnDoubleLock {
    private static DBConnDoubleLock conn;
    private DBConnDoubleLock(){}
    public DBConnDoubleLock getInstance(){
        //two locks //double checking if the conn is null or not
        if(conn == null){
            synchronized (DBConnDoubleLock.class){
                if(conn == null){
                    conn = new DBConnDoubleLock();
                }
            }
        }
        return conn;
    }
}
