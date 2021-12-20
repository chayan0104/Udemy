package CollectionFramework.HasSet;
import java.util.LinkedHashSet;

//same as hashset but it maintains order

public class LinkedHashSetDemo {
    public static void main(String[] args) {
       LinkedHashSet<String> values = new LinkedHashSet<String>();
        values.add("my");
        values.add("mine");
        values.add("myself");
        values.add("mine");
        for (String words : values){
            System.out.println(words);
        }


    }
}
