package com.main;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;
import java.io.File;

public class EmbeddedTomcatEx {

    public static void main(String[] args) throws LifecycleException,
            InterruptedException, ServletException {

        String docBase = "src/main/webapp/";

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8082);

        tomcat.addWebapp("/", new File(docBase).getAbsolutePath());

        tomcat.start();
        tomcat.getServer().await();
    }
}
