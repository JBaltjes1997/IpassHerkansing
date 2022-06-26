package com.example.demo.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/restservices")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(RolesAllowedDynamicFeature.class);
        packages("com/example/demo/config", "com/example/demo/presentation", "com/example/demo/Security");
        // krijg een servlet exception omdat ik de build application servers heb aangepast
    }
}