package CreationalDesignPattern.Singleton;

public class Main {
    public static void main(String args[]){
        //Eager initialization
        DBConnectionEager dbConnectionEager = DBConnectionEager.getInstance();
    }
}
