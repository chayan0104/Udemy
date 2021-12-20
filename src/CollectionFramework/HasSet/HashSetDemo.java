package CollectionFramework.HasSet;
import java.util.HashSet;
//it's basically used to prevent duplicate
//hash set does not support duplicate and doesn't maintain order.

public class HashSetDemo {
    public static void main(String[] args) {
       HashSet<Integer> values = new HashSet<Integer>();
        values.add(10);
        values.add(12);
        values.add(15);
        values.add(10);
        for (Integer numbers : values){
            System.out.println(numbers);
        }


    }
}
