public class Aga extends Toads implements Legs // Жаба
{

    public Aga(String name) 
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
        return "ядовитый";
    }

    @Override
    public String info()
    {
        return "Длина тела достигает 24 см (обычно 15-17 см), масса - более килограмма. Кожа сильно ороговевшая, бородавчатая. Окраска неяркая: сверху тёмно-бурая или серая с большими тёмными пятнами; брюхо желтоватое, с частыми бурыми пятнышками.";
    }

    @Override
    public String toString() 
    {
        return String.format("Aga, %s", super.toString());
    }

    @Override
    public int amountLegs() {
        return 4;
    }
}
