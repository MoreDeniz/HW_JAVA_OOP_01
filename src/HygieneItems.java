/*
    3. Предметы гигиены, содержащие следующие свойства:
        3.1 Количество штук в упаковке
*/

public class HygieneItems extends Goods{
    private Integer numbers;
    public HygieneItems(String name, Double prise, Integer quantity, String unit,
                           Integer numbers) {
        super(name, prise, quantity, unit);
        this.numbers = numbers;
    }
    public Integer getNumbers(){
        return numbers;
    }
    @Override
    public String toString() {
        return super.toString() + ", Количество в упаковке: \'" + getNumbers() + "\'";
    }
}
