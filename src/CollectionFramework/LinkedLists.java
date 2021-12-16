package CollectionFramework;
import java.util.LinkedList;
public class LinkedLists {
    public static void main(String[] args) {

        LinkedList<Integer> al = new LinkedList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.remove(3);

        for (Integer number : al) {
            System.out.println(number);
        }
    }
}
