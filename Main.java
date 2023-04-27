public class Main 
{
    public static void main (String[] args)
    {
        

        Terrarium terrarium = new Terrarium();
        terrarium.setRadio(new Radio());
        
        terrarium.addList(new Aga("Австралийская жаба-ага"))
                .addList(new Ceylon_caecilian("Цейлонский рыбозмей"))
                .addList(new Edible_frog("Французская лягушка съедобная"))
                .addList(new Alpine_newt("Альпийский тритон"));
        
        for (var item : terrarium.getListTerrarium()) 
        {
            System.out.println("---------------------");
            System.out.println(item);
        }
        //for (var item : terrarium.getListTerrarium())
        for (var item : terrarium.getNotification()) 
        {
            System.out.println("---------------------");
            System.out.println(item.info());
        }

        System.out.println("---------------------");

        /* for (var item : terrarium.legs()) 
        {
            
            System.out.printf("%s - %d", item.toString(), item.amountLegs());
            System.out.println();
            System.out.println("---------------------");
        } */

        System.out.printf("Наибольшее количество конечностей - %s", terrarium.maxLegs());
    }
}
