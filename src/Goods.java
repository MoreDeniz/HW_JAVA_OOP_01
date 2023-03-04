/*
        1. Название
        2. Цена
        3. Количество
        4. Единица измерения
        У всех классов перегрузить метод ToString класса Object, от которого наследуются все классы,
        в котором будет происходить вывод всей информации о товаре,
        так же реализовать конструкторы, принимающие все поля.
*/

public class Goods {
    private String name;
    private Double prise;
    private Integer quantity;
    private String unit;

    public Goods(String name, Double prise, Integer quantity, String unit){
        this.name = name;
        this.prise = prise;
        this.quantity = quantity;
        this.unit = unit;
    }

    public Goods(){
    }

    public String getName(){
        return name;
    }
    public Double getPrise(){
        return prise;
    }
    public Integer getQuantity(){
        return quantity;
    }
    public String getUnit(){
        return unit;
    }
    @Override
    public String toString() {
//        return String.format("Товар: %s;\nЦена: %.2f;\nКоличество: %d;\n,Ед.измерения: %d\n",
//                getName(), getPrise(), getQuantity(), getUnit());
        return "Товар: '" + getName() + '\''+
                ", Цена: '" + getPrise() + '\''+
                ", Количество: '" + getQuantity() +
                " " + getUnit() + '\'';
    }
}
