import java.util.ArrayList;
import java.util.List;

public class Terrarium 
{
    private List<Amphibia> listTerrarium = new ArrayList<>();

    public List<Amphibia> getListTerrarium()
    {
        return listTerrarium;
    }

    public Terrarium addList(Amphibia amphibia)
    {
        listTerrarium.add(amphibia);
        return this;
    }

    private Radio radio;

    public void setRadio(Radio radio) {
        this.radio = radio;
    }
    
    public List<Notification> getNotification()
    {
        List<Notification> listNotification = new ArrayList<>();
        for (var item : listTerrarium) 
        {
            listNotification.add(item);
        }

        listNotification.add(radio);
        return listNotification;
    }

    public List<Legs> legs()
    {
        List<Legs> legs = new ArrayList<>();
        for (var item : listTerrarium) 
        {
            legs.add((Legs) item);
        }
        return legs;
    }

    public Legs maxLegs()
    {
        int index = 0;
        for (int i = 0; i < legs().size(); i++) 
        {
            if (legs().get(i).amountLegs() > legs().get(index).amountLegs())
            {
                index = i;
            }
        }
        return legs().get(index);
    }
}