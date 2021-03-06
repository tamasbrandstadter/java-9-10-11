package features.java9;

import features.MyClass;

// https://openjdk.java.net/jeps/213
public class DiamondOperator {

    public static void main(String[] args) {
        // Allow the diamond operator with anonymous classes
        // if the argument type of the inferred type is denotable
        MyClass<String> c2 = new MyClass<>("James") {
            @Override
            public void processData() {
                System.out.println("Processing " + getData());
            }
        };
        c2.processData();

        MyClass<Integer> c3 = new MyClass<>(1000) {
            @Override
            public void processData() {
                System.out.println("Processing " + getData());
            }
        };
        c3.processData();

        // Cannot infer the type of a non-denotable type (intersection type)
        // MyClass<T extends Comparable<T> & Serializable> c4 = new MyClass<> {};
    }

}
