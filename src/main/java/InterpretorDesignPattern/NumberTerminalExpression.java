package InterpretorDesignPattern;

import javax.swing.*;

public class NumberTerminalExpression implements AbstractExpression {

    String stringValue;

    NumberTerminalExpression(String strVal){
        this.stringValue = strVal;
    }
    @Override
    public int interpret(Context context) {
        return context.get(stringValue);
    }
}
