package InterpretorDesignPattern;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.put("a",4);
        context.put("b", 5);

        context.put("c",2);
        context.put("d",3);

        //(a*b)+(c*d)
        AbstractExpression expression1 = new MultiplyNonTerminalExpression(new NumberTerminalExpression("a"), new NumberTerminalExpression("b"));
        AbstractExpression expression2 = new MultiplyNonTerminalExpression(new NumberTerminalExpression("c"), new NumberTerminalExpression("d"));
        AbstractExpression expression3 = new AddNonTerminalExpression(expression1, expression2);
        System.out.println(expression3.interpret(context));

    }

}
