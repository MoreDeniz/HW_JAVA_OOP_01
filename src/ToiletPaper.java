/*
    10. Туалетная бумага, содержащее следующее свойство:
        10.1 Количество слоёв
 */

public class ToiletPaper extends HygieneItems {
    private Integer layers;
    public ToiletPaper(String name, Double prise, Integer quantity, String unit,
                          Integer numbers, Integer layers) {
        super(name, prise, quantity, unit, numbers);
        this.layers = layers;
    }
    public Integer getLaiers(){
        return layers;
    }
    @Override
    public String toString() {
        return super.toString() + ", Количество слоёв: \'" + getLaiers() + "\'";
    }
}
