package com.zam.thrift.test;

import com.zam.thrift.test.impl.HelloImpl;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Administrator on 2016/5/23.
 */
public class Main {
    public static Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        try {
            TServerTransport tServerTransport = new TServerSocket(8888);
            TProtocolFactory factory = new TCompactProtocol.Factory();
            TProcessor processor = new Hello.Processor<>(new HelloImpl());
            TServer server = new TThreadPoolServer(new TThreadPoolServer.Args(
                    tServerTransport
            ).protocolFactory(factory).processor(processor));
            System.out.println("Server start.");
            server.serve();
        } catch (TTransportException e) {
            e.printStackTrace();
        }
    }
}
