package com.sq2wkh.java8.features.extension_methods.impl;

import com.sq2wkh.java8.features.extension_methods.DefaultMethod;

/**
 * Created by alipinski on 2016-03-11.
 */
public class DefaultMethodImpl implements DefaultMethod {
    public String getHelloForName(String name) {
        return getHello(name) + "!!!";
    }
}
