import java.util.ArrayList;

public class StarAdd {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("kalem");
        words.add("Bakur");
        words.add("farah");
        words.add("Greatness");

        System.out.println("Dongu oncesi: "+ words);
        System.out.println("Liste Usunlugu: "+ words.size());

        for (int i = 0; i < words.size(); i +=2) {
            words.add(i, "*");
        }
        System.out.println("Dongu sonrasi "+ words);
        System.out.println("Liste usunlugu "+ words.size());
        for (int i = 0; i < words.size(); i++)  {
            words.remove(i);
        }
        System.out.println("Dongu sonrasi "+ words);
        System.out.println("Liste usunlugu "+ words.size());
        for (int i = words.size()-2; i >=0; i -=2){
            words.remove(i);
        }
        System.out.println("Silme sonrasi "+ words);
        System.out.println("silme liste usunlugu "+ words.size());


    }
}

