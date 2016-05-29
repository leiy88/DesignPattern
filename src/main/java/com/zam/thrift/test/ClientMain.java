package com.zam.thrift.test;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

/**
 * Created by Administrator on 2016/5/23.
 */
public class ClientMain {
    public static void main(String[] args) {
        try {
            TTransport transport = new TSocket("localhost", 8888);
            transport.open();
            TProtocol protocol = new TCompactProtocol(transport);
            Hello.Client client = new Hello.Client(protocol);
            long start = System.currentTimeMillis();
            System.out.println(client.helloString("world!"));
            System.out.println("耗时：" + (System.currentTimeMillis() - start) + "ms");
            transport.close();
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (TException e) {
            e.printStackTrace();
        }

    }
}
