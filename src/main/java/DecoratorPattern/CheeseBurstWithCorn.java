package DecoratorPattern;

public class CheeseBurstWithCorn extends Toppings{

    BasePizaa basePizaa;

    CheeseBurstWithCorn(BasePizaa basePizaa){
        this.basePizaa = basePizaa;
    }
    @Override
    public int cost() {
        return this.basePizaa.cost()+50;
    }
}
