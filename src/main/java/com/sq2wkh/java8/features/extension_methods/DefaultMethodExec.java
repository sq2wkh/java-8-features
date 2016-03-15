package com.sq2wkh.java8.features.extension_methods;

import com.sq2wkh.java8.features.extension_methods.impl.DefaultMethodImpl;

/**
 * Created by alipinski on 2016-03-11.
 */
public class DefaultMethodExec {

    public static void main(String[] args) {
        DefaultMethodImpl extensionMethod = new DefaultMethodImpl();
        System.out.println("extensionMethod.getHelloForName: " + extensionMethod.getHelloForName("sq2wkh"));
        System.out.println("extensionMethod.getHello: " + extensionMethod.getHello("sq2wkh"));
    }
}
