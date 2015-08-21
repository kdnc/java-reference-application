package javagenerics;

import java.util.ArrayList;
import java.util.List;

public class Step1TheUnknownWildcard {

    public static void main(String[] args) {
        List<A> listA = new ArrayList<A>();
        processElements(listA);
    }

    /*List<?> means a list typed to an unknown type. This could be a List<A>, a List<B>, a List<String> etc.
    Since the you do not know what type the List is typed to, you can only read from the collection,
    and you can only treat the objects read as being Object instances.*/
    public static void processElements(List<?> elements){
        for(Object o : elements){
            System.out.println(o);
        }
    }
}
