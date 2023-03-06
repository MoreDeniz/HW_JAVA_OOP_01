/*
    11. Подгузники, содержащие следующее свойства:
        11.1 Размер: NB, S, M, L, XL, XХL
        11.2 Минимальный вес
        11.3 Максимальный вес
        11.4 Тип
 */

public class Diapers extends GoodsForKids{
    private String size;
    private Double minWeight;
    private Double maxWeight;
    private String type;
    public Diapers(String name, Double prise, Integer quantity, String unit,
                    Integer minAge, String Hypoallergenic,
                    String size, Double minWeight, Double maxWeight, String type) {
        super(name, prise, quantity, unit, minAge, Hypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }
    public String getSize(){
        return size;
    }
    public Double getMinWeight(){
        return minWeight;
    }
    public Double getMaxWeight(){
        return maxWeight;
    }
    public String getType(){
        return type;
    }
    @Override
    public String toString() {
        return super.toString() + ", Размер: \'" + getSize() +
                "\', Минимальный вес: \'" + getMinWeight() +
                "\', Максимальный вес: \'" + getMaxWeight() +
                "\' Тип: \'" + getType() + "\'";
    }
}
