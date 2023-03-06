/*
    2. Напитки, содержащие следующие свойства:
        2.1 Объём
 */

public class Drinks extends Goods{
    private Double volume;
    public Drinks(String name, Double prise, Integer quantity, String unit,
                     Double volume) {
        super(name, prise, quantity, unit);
        this.volume = volume;
    }
    public Double getVolume(){
        return volume;
    }
    @Override
    public String toString() {
        return super.toString() + " Объём: \'" + getVolume() + "\'";
    }
}
