import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        HashMap<String,String> dict = new HashMap<>();

        dict.put("ιταμός", "προκλητικός, αυθάδης, αναιδής");
        dict.put("όνειδος", "ντροπή, καταισχύνη");
        dict.put("πομφόλυγες", "αερολογίες, ανοησίες");

        //Ena synolo apo map entries
        Set<Map.Entry<String, String>> items = dict.entrySet();

        for (var item: items) {
            System.out.println("Key: " + item.getKey());
            System.out.println("Value: " + item.getValue());
            System.out.println("-------------");
        }


        //Iterator panw se stoixeia tou MapEntry
        Iterator<Map.Entry<String, String>> iter = items.iterator();
        iter.next().setValue("εξάμβλωμα");
        iter.next();
        iter.remove();
        System.out.println(dict);

    }
}
