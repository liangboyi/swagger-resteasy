package io.pivotal.test;

import io.swagger.jaxrs.config.BeanConfig;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by bliang on 15/08/2017.
 */

public class DemoApplication extends Application {
    private Set<Object> singletons = new HashSet<Object>();

    public DemoApplication() {
//        singletons.add(new ServiceResource());

        configureSwagger();
    }
/*
    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }

    */

    private void configureSwagger() {
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.0");
        beanConfig.setSchemes(new String[] { "http" });
        beanConfig.setHost("localhost:9095");
        beanConfig.setBasePath("/");
        beanConfig.setResourcePackage(
                ServiceResource.class.getPackage().getName());
        beanConfig.setTitle("RESTEasy, ...");
        beanConfig.setDescription("Sample application to demonstrate ...");
        beanConfig.setScan(true);
    }

    //add for swagger
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet();

        //resources.add(FirstResource.class);
        //resources.add(SecondResource.class);
        //...

        resources.add(ServiceResource.class);
        resources.add(io.swagger.jaxrs.listing.ApiListingResource.class);
        resources.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);


        return resources;
    }
    //end
}
