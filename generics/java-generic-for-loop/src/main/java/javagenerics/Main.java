package javagenerics;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*Here is a simple example that iterates a generic List:*/
        List<String> list = new ArrayList<String>();
        for(String aString : list) {
            System.out.println(aString);
        }

        /*Here is an example that uses a Set:*/
        Set<String> set = new HashSet<String>();
        for(String aString : set) {
            System.out.println(aString);
        }

        /*Here is an example for a Map*/
        Map<Integer, String> map = new HashMap<Integer, String>();
//... add key, value pairs to the Map
        for(Integer aKey : map.keySet()) {
            String aValue = map.get(aKey);
            System.out.println("" + aKey + ":" + aValue);
        }
        for(String aValue : map.values()) {
            System.out.println(aValue);
        }
    }

}
