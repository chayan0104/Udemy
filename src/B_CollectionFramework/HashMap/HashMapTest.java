package B_CollectionFramework.HashMap;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String args[]){
        HashMap<String, String>  dictionary = new HashMap<String, String>();
        //LinkedHashMap<String, String>  dictionary = new LinkedHashMap<String, String>();
        dictionary.put("Brave " , "what you need");
        dictionary.put("courage" , "what you need");
        dictionary.put("bravo" , "what you need");
        dictionary.put("thrill " , "what you need");
        dictionary.put("mai" , "what you need");
        for (String word : dictionary.keySet()){
            System.out.println(word);
            System.out.println(dictionary.get(word));
        }


    }

}
