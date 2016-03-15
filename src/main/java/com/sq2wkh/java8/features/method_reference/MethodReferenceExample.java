package com.sq2wkh.java8.features.method_reference;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alipinski on 2016-03-15.
 */
public class MethodReferenceExample {

    public static void main(String args[]) {
        List names = new ArrayList();
        names.add("Tom");
        names.add("Jhon");
        names.add("Jerry");
        names.add("Adam");
        names.add("Gary");

        /**
         * Method references help to point to methods by their names. A method reference
         * is described using :: (double colon) symbol.
         * A method reference can be used to point the following types of methods −
         *  Static methods
         *  Instance methods
         *  Constructors using new operator (TreeSet::new)
         * @see <a href="http://www.tutorialspoint.com/java8/java8_method_references.htm">Link</a>
         */
        names.forEach(System.out::println);
    }
}
