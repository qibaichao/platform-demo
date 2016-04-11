package com.cyou;


import org.mortbay.jetty.Connector;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.nio.SelectChannelConnector;
import org.mortbay.jetty.webapp.WebAppContext;


/**
 * @author qibaichao
 */
public class JettyContainer {

    public static void main(String[] args) {
        try {
            String port = "8083";
            Server server = new Server();
            Connector connector = new SelectChannelConnector();
            connector.setPort(Integer.parseInt(port));
            server.setConnectors(new Connector[]{connector});
            WebAppContext context = new WebAppContext();
            context.setResourceBase("platform/src/main/webapp");
            context.setContextPath("/");
            server.setHandler(context);
            server.setStopAtShutdown(true);
            server.start();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

}
