package ChainOfResponsibility;

import java.util.HashMap;

public class InfoLogger extends Logger{
    InfoLogger(Logger nextLogger){
        super(nextLogger);
    }

    public void log(int loglevel, String msg){
        if(loglevel == INFO){
            System.out.println("InFO: "+ msg);
        }else{
            super.log(loglevel, msg);
        }
    }
}
