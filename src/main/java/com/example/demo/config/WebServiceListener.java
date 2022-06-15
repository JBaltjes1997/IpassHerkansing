package com.example.demo.config;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class WebServiceListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce){
        System.out.println("system initializing");
//        try{
//            dataOpslagManager.loadedData();
//        } catch (Exception e){
//            e.printStackTrace();
//        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce){
        System.out.println("system closing");
//        try{
//            dataOpslagManager.saveData();
//        } catch (Exception e){
//            System.out.println("Error saving data ..." + e.getMessage());
//        }
//
//        Schedulers.shutdownNow();
//        HttpResources.disposeLoopsAndConnectionsLater(Duration.ZERO, Duration.ZERO).block();
    }
}