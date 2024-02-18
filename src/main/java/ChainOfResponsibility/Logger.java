package ChainOfResponsibility;

public abstract class Logger {

    public static int INFO =1;
    public static int DEBUG = 2;

    public static int ERROR = 3;

    Logger nextLogger;

    Logger(Logger nextLogger){
        this.nextLogger =nextLogger;
    }

    public void log(int loglevel, String msg){
        if(nextLogger != null){
            nextLogger.log(loglevel,msg);
        }
    }
}
