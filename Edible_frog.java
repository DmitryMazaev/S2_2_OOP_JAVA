public class Edible_frog extends Frogs implements Legs//Лягушка
{
    public Edible_frog(String name) 
    {
        super (name);
    }
    
    @Override
    public String sweem()
    {
        return "плавает";
    }

    @Override
    public Integer leg()
    {
        return 4;
    }

    @Override
    public String venom()
    {
        return "не ядовитый";
    }

    @Override
    public String info()
    {
        return "Максимальная длина тела 97 мм. Сверху чаще всего окрашены в зелёный (салатный, травянистый) цвет, но у части особей фон серый, оливковый, буроватый или мозаично зелёно-бурый.";
    }

    @Override
    public String toString() 
    {
        return String.format("Edible frog, %s", super.toString());
    }

    @Override
    public int amountLegs() {
        return 4;
    }
}
