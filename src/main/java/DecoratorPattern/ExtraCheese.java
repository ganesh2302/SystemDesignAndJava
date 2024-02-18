package DecoratorPattern;

public class ExtraCheese extends Toppings{
    BasePizaa basePizaa;


    public ExtraCheese(BasePizaa basePizaa) {
        this.basePizaa = basePizaa;
    }

    @Override
    public int cost() {
        return this.basePizaa.cost()+10;
    }
}
