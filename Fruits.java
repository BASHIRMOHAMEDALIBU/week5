import java.util.ArrayList;

public class Fruits{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Elma");
        list.add("Portakal");
        list.add("Muz");
        System.out.println(list);

        for(String  Fruits: list)
            System.out.println(Fruits);
    }
}