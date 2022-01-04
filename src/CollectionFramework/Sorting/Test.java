package CollectionFramework.Sorting;

import java.util.*;
import java.util.HashSet;

public class Test {
    public static void main(String args[]){
        HashSet<Integer> values = new HashSet<Integer>();
        values.add(10);
        values.add(12);
        values.add(15);
        values.add(18);


      ArrayList<Integer> List = new  ArrayList<Integer>( values) ;

      Collections.sort(List);

        System.out.printf(String.valueOf(List));
    }
}
