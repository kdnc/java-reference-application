package javagenerics;

import java.util.ArrayList;
import java.util.List;

public class Step3TheSuperWildcardBoundary {

    public static void main(String[] args) {
        List<A> listA = new ArrayList<A>();
        insertElements(listA);

        List<Object> listObject = new ArrayList<Object>();
        insertElements(listObject);

        /*The insertElements() method cannot read from the list though, except if it casts the read objects to
        Object.The elements already present in the list when insertElements() is called could be of any type
        that is either an A or superclass of A, but it is not possible to know exactly which class it is.*/
        Object object = listA.get(0);

        /*But this is not valid:*/
//        A object = listA.get(0);

    }

    /*List<? super A> means that the list is typed to either the A class, or a superclass of A.
    When you know that the list is typed to either A, or a superclass of A, it is safe to
    insert instances of A or subclasses of A (e.g. B or C) into the list.*/
    public static void insertElements(List<? super A> list){
        list.add(new A());
        list.add(new B());
        list.add(new C());
    }
}
