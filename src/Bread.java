/*
    7. Хлеб, содержащий следующие свойство:
        7.1 Тип муки
 */

public class Bread extends Food {
    private String flour;
    public Bread(String name, Double prise, Integer quantity, String unit,
                    Integer bestBefore, String flour) {
        super(name, prise, quantity, unit, bestBefore);
        this.flour = flour;
    }

    public String getFlour() {
        return flour;
    }

    @Override
    public String toString() {
        return super.toString() + ", Тип муки: \'" + getFlour() + "\'";
    }
}



