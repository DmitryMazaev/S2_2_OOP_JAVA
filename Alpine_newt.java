public class Alpine_newt extends Newt implements Legs
{
    public Alpine_newt(String name) 
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
        return 5;
    }

    @Override
    public String info()
    {
        return "Общая длина тела альпийского тритона, включая хвост, составляет в среднем около 11 см. Хвост немного короче или равен длине тела с головой. В течение водной фазы жизни кожа тритона гладкая, во время наземного образа жизни - бугристая.";
    }

    @Override
    public String venom()
    {
        return "не ядовитый";
    }

    @Override
    public String toString() 
    {
        return String.format("Alpine newt, %s", super.toString());
    }

    @Override
    public int amountLegs() 
    {
        return 5;
    }

    
}
