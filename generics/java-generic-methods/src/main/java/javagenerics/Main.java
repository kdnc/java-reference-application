package javagenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException{
        String stringElement = "stringElement";
        List<String> stringList = new ArrayList<String>();
        String theElement = addAndReturn(stringElement, stringList);

        Integer integerElement = new Integer(123);
        List<Integer> integerList = new ArrayList<Integer>();
        Integer theElement2 = addAndReturn(integerElement, integerList);

        String stringElement2 = "stringElement";
        List<Object> objectList = new ArrayList<Object>();
        Object theElement3 = addAndReturn(stringElement2, objectList);

        /*Compiler Error*/
//        Object objectElement = new Object();
//        List<String> stringList2 = new ArrayList<String>();
//        Object theElement4 = addAndReturn(objectElement, stringList);
    }

    public static <T> T addAndReturn(T element, Collection<T> collection){
        collection.add(element);
        return element;
    }
}
