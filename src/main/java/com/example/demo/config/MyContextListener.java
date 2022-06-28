//package com.example.demo.config;
//
//import com.example.demo.data.PersistenceManager;
//import reactor.core.scheduler.Schedulers;
//import reactor.netty.http.HttpResources;
//
//import javax.servlet.ServletContextEvent;
//import javax.servlet.ServletContextListener;
//import javax.servlet.annotation.WebListener;
//import java.time.Duration;
//
//@WebListener
//class MyContextListener implements ServletContextListener {
//    @Override
//    public void contextInitialized(ServletContextEvent sce) {
//        System.out.println("ContextListener initializing");
//        try {
//            PersistenceManager.loadPersonsToAzure();
//        } catch(Exception e) {
//            System.out.println("Error loading data ...." + e.getMessage());
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void contextDestroyed(ServletContextEvent sce){
//        System.out.println("ContextListener destroyed");
//        try{
//            PersistenceManager.savePersonsToAzure();
//        } catch(Exception e){
//            System.out.println("Error service ..." + e.getMessage());
//            e.printStackTrace();
//        }
//
//        Schedulers.shutdownNow();
//        HttpResources.disposeLoopsAndConnectionsLater(Duration.ZERO, Duration.ZERO).block();
//    }
//}
