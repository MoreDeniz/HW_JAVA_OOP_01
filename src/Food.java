/*
     1. Продукты питания, содержащие следующие свойства:
        1.1 Срок годности
 */

public class Food extends Goods{
    private Integer bestBefore;
    public Food(String name, Double prise, Integer quantity, String unit,
                   Integer bestBefore) {
        super(name, prise, quantity, unit);
        this.bestBefore = bestBefore;
    }
    public Integer getBestBefore(){
        return bestBefore;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", Срок годности: \'" + getBestBefore() + " дней\'";
    }
}
