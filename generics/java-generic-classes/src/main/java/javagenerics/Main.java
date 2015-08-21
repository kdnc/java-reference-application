package javagenerics;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException{
        GenericFactory<MyClass> factory = new GenericFactory<MyClass>(MyClass.class);
        MyClass myClassInstance = factory.createInstance();

        GenericFactory<SomeObject> factory2 = new GenericFactory<SomeObject>(SomeObject.class);
        SomeObject someObjectInstance = factory2.createInstance();

        myClassInstance.print();
        someObjectInstance.print();
    }
}
