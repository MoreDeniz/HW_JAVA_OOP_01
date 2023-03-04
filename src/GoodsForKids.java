/*
    4. Детские товары:
        4.1 Минимальный возраст
        4.2 Гипоаллергенность
*/

public class GoodsForKids extends Goods{
    private Integer minAge;
    private String hypoallergenic;
    public GoodsForKids(String name, Double prise, Integer quantity, String unit,
                           Integer minAge, String hypoallergenic) {
        super(name, prise, quantity, unit);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }
    public Integer getMinage(){
        return minAge;
    }
    public String getHipo(){
        return hypoallergenic;
    }
    @Override
    public String toString() {
        return super.toString() + ", Минимальный возраст: \'" + getMinage() + "\'," +
                                  "Гипоаллергенность: \'" + getHipo() + "\'";
    }
}
