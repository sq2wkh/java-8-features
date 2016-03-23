package com.sq2wkh.java8.features.parameter_names;



import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by alipinski on 2016-03-23.
 */
public class ParameterNamesExample {
    /**
     * finally, Java 8 bakes this demanding feature into the language (using Reflection API and Parameter.getName()
     * method) and the byte-code (using new javac compiler argument –parameters).
     * @see <a href="https://www.javacodegeeks.com/2014/05/java-8-features-tutorial.html">Link</a>
     */
    public static void main(String[] args) throws Exception {
        Method method = ParameterNamesExample.class.getMethod( "main", String[].class );
        for( final Parameter parameter: method.getParameters() ) {
            System.out.println( "Parameter: " + parameter.getName() );
        }
    }
}
