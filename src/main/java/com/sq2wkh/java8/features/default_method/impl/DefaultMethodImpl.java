package com.sq2wkh.java8.features.default_method.impl;

import com.sq2wkh.java8.features.default_method.DefaultMethod;

/**
 * Created by alipinski on 2016-03-11.
 */
public class DefaultMethodImpl implements DefaultMethod {
    public String getHelloForName(String name) {
        return getHello(name) + "!!!";
    }
}
