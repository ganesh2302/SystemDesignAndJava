package DecoratorPattern;

public class Customer {

    public static void main(String args[]){

        BasePizaa pizza =  new CheeseBurstWithCorn(new FarmHouse());
        System.out.println(pizza.cost());

    }
}
