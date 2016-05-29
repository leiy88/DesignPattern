package com.zam.thrift.test.impl;

import com.zam.thrift.test.Hello;
import org.apache.thrift.TException;

/**
 * Created by Administrator on 2016/5/23.
 */
public class HelloImpl implements Hello.Iface {

    @Override
    public String helloString(String word) throws TException {
        return "Hello " + word;
    }
}
