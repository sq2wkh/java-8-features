package com.sq2wkh.java8.features.extension_methods;

/**
 * Created by alipinski on 2016-03-11.
 */
public interface ExtensionMethod {
    String getHelloForName(String name);

    /**
     *
     * Java 8 now allows you to add non-abstract method implementations to
     * interfaces by utilizing the default and static keyword. Methods with
     * default keyword are known as default methods or defender methods in
     * Java. Before Java 8, it was virtually impossible to change an interface
     * once published. Any change e.g. addition of a new method would have broken
     * all clients. That's why when Java 8 decided to switch to internal iterator
     * implementation using forEach() method, they face a daunting challenge of
     * breaking all implementation of Iterable interface. Since backward compatibility
     * is top priority for Java engineers, and it wasn't practical to break all clients,
     * they came up with idea of default method. This is an amazing and very powerful change,
     * because now you can evolve your existing interface with all the knowledge you have gained
     * after using them. JDK itself is utilizing default methods in big way, java.util.Map interface
     * is extended with several new default methods e.g. replaceAll(), putIfAbsent(Key k, Value v)
     * and others. By the way, Since default method allows extension of existing interface, it’s
     * also known as Extension method. You are also free to define any number of default method in
     * your interface. I think after this change, you unlikely need an abstract class to provide
     * skeletal implementation as described in Effective Java e.g. List comes with AbstractList,
     * Collection comes with AbstractCollection, Set comes with AbstractSet and Map comes with
     * AbstractMap. Instead of creating a new abstract class with default implementation,
     * you can define them as default method inside interface itself. Similarly, introduction
     * of static methods inside interface will make pattern of an interface utility class
     * redundant e.g. Collections for Collection interface, Paths for Path and so on. You
     * can directly define static utility method on interface itself.
     * source: http://javarevisited.blogspot.com/2014/07/default-defender-or-extension-method-of-Java8-example-tutorial.html
     */
    default String getHello(String name){
        return "Hello " + name;
    }
}
