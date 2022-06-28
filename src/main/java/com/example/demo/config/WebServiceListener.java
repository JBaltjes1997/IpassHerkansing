package com.example.demo.config;

import com.example.demo.data.PersistenceManager;
import reactor.core.scheduler.Schedulers;
import reactor.netty.http.HttpResources;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.time.Duration;

@WebListener
public class WebServiceListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce){
        System.out.println("system initializing");
         try {
            PersistenceManager.loadPersonsToAzure();
        } catch(Exception e) {
            System.out.println("Error loading data ...." + e.getMessage());
            e.printStackTrace();
        }
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
