public class Ceylon_caecilian extends Ichthyophis implements Legs
{
    public Ceylon_caecilian(String name) 
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
        return 0;
    }

    @Override
    public String venom()
    {
        return "не ядовитый";
    }

    @Override
    public String info()
    {
        return "Общая длина достигает 40-45 см. Голова среднего размера. Между глазами и ноздрями есть пара белых щупалец. Тело тонкое, имеет до 400 кожных складок.";
    }

    @Override
    public String toString() 
    {
        return String.format("Ceylon caecilian, %s", super.toString());
    }

    @Override
    public int amountLegs() {
        return 0;
    }

    
}
