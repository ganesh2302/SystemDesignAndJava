package ChainOfResponsibility;

public class DebugLogger extends Logger{

    DebugLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(int loglevel, String msg) {
        if(loglevel == DEBUG){
            System.out.println("Debug: "+msg);
        }else {
            super.log(loglevel, msg);
        }
    }
}
