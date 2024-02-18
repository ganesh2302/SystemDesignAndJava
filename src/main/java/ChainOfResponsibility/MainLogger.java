package ChainOfResponsibility;

public class MainLogger {

    public static void main(String args[]){
        //chain is created
        Logger logger = new InfoLogger(new DebugLogger( new ErrorLogger(null)));

        logger.log(3,"RuntimeError Occurred");
        logger.log(2,"debug level Occurred");
        logger.log(1,"Info level Occurred");


    }
}
