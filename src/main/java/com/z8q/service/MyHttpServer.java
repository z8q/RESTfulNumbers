package com.z8q.service;

import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

public class MyHttpServer {

    public void startServer() throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/createcardpost", new HandlerAddInformation());
        server.start();
    }
}
