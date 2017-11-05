package decorator;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {

        double condimentCost = 0;
        if (beverage.getSize() == Size.TALL) {
            condimentCost = .1;
        } else if (beverage.getSize() == Size.GRANDE) {
            condimentCost = .15;
        } else if (beverage.getSize() == Size.VENTI) {
            condimentCost = .2;
        }

        return beverage.cost() + condimentCost;
    }

}
