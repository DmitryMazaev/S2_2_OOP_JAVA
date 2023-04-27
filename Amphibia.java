public abstract class Amphibia implements Notification
{
    private String name;

    public Amphibia(String name) //конструктор
    {
        this.name = name;
    }

    public abstract String sweem();

    public abstract Integer leg();

    public abstract String venom();

    //public abstract String info();
    
    @Override
    public String toString() 
    {
        return String.format("Название - %s, отношение к плаванию - %s, колтичество конечностей - %d, отношение к яду - %s", name, sweem(), leg(), venom());
    }
}
