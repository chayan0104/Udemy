package CollectionFramework.Merging;
import java.util.ArrayList;
public class Merge {
    public static void main(String args[]) {
        //ArrayList<String> alist=new ArrayList<String>();
//list 1
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("Steve");
        alist.add("Tim");
        alist.add("Lucy");
        alist.add("Pat");
        alist.add("Angela");
        alist.add("Tom");
//list 2
        ArrayList<String> blist = new ArrayList<String>();
        alist.add("PAl");
        alist.add("SAM");
        alist.add("MADDY");
        alist.add("KATY");

        //merging
        alist.add(String.valueOf(blist));

        //displaying elements
        System.out.println(alist);


    }
}
