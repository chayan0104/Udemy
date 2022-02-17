package CollectionFramework.TreeMap;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Treemap {
    public static void main(String args[]){
        TreeMap<String, String> dictionary = new TreeMap<String, String>();
// over riding of data is allowed in here
        dictionary.put("Brave " , "what you need");
        dictionary.put("courage" , "what you need");
        dictionary.put("bravo" , "what you need");
        dictionary.put("thrill " , "what you need");
        dictionary.put("mai" , "what you need");

        for(Map.Entry<String,String> entry : dictionary.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }

}
