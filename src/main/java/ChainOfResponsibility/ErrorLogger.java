package ChainOfResponsibility;

public class ErrorLogger extends Logger{


    ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(int loglevel, String msg) {

        if(loglevel == ERROR){
          System.out.println("Error: "+msg);
        } else{
            super.log(loglevel, msg);
        }
    }
}
