package com.sq2wkh.java8.features.parameter_names;



import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by alipinski on 2016-03-23.
 */
public class ParameterNamesExample {

    public static void main(String[] args) throws Exception {
        Method method = ParameterNamesExample.class.getMethod( "main", String[].class );
        for( final Parameter parameter: method.getParameters() ) {
            System.out.println( "Parameter: " + parameter.getName() );
        }
    }
}
