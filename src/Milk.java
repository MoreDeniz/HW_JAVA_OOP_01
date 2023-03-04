/*
    5. Молоко, содержащиее следующее свойство:
        5.1 Процент жирности
        5.2 Срок годности
 */

public class Milk extends Drinks{
    private Double fat;
    private Integer bestBefore;
    public Milk(String name, Double prise, Integer quantity, String unit,
                 Double volume, Double fat, Integer bestBefore) {
        super(name, prise, quantity, unit, volume);
        this.fat = fat;
        this.bestBefore = bestBefore;
    }
    @Override
    public String toString() {
        return super.toString() + ", Процент жирности: \'" + fat +
                "%\', Срок годности: \'" + bestBefore + " суток\'";
    }
}
