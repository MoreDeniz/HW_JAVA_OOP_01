/*
    8. Яйца, содержащее следующиее свойство:
        8.1 Количество в упаковке
 */

public class Eggs extends Food{
    private Integer numbs;
    public Eggs(String name, Double prise, Integer quantity, String unit,
                 Integer bestBefore, Integer numbs) {
        super(name, prise, quantity, unit, bestBefore);
        this.numbs = numbs;
    }
    public Integer getNum(){
        return numbs;
    }

    @Override
    public String toString() {
        return super.toString() + ", Количество в упаковке: \'" + getNum() + "\'";
    }
}
