package javagenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException{
        String string   = getInstance(String.class);
        MyClass myClass = getInstance(MyClass.class);
        myClass.print();
    }

    public static <T> T getInstance(Class<T> theClass)
            throws IllegalAccessException, InstantiationException {
        return theClass.newInstance();
    }
}
