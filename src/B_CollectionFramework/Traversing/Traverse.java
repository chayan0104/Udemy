package B_CollectionFramework.Traversing;
import java.util.ArrayList;
public class Traverse {
    public static void main(String[] args) {
        //ArrayList<String> alist=new ArrayList<String>();

        ArrayList<String> alist = new ArrayList<String>();
        alist.add("Steve");
        alist.add("Tim");
        alist.add("Lucy");
        alist.add("Pat");
        alist.add("Angela");
        alist.add("Tom");

        for (int i = 0; i < alist.size(); i++) {
            System.out.println(alist.get(i));
        }
        //or
       for (String peoples : alist){
            System.out.println(peoples);
        }
    }
}
