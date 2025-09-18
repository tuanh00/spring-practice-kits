package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
* Spring @Configuration annotation is part of the spring core framework.
* Spring Configuration annotation indicates that the class bas @Bean definition
* methods. So Spring container can process the class and generate Spring Beans
* to be used in the application.
* */
@Configuration
public class ProjectConfig {

    @Bean(name="audi")
    Vehicle vehicle1() {
        var veh = new  Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Bean(value="hyundai")
    Vehicle vehicle2() {
        var veh = new  Vehicle();
        veh.setName("Hyundai");
        return veh;
    }

    @Bean(value="mercedes")
    Vehicle vehicle3() {
        var veh = new  Vehicle();
        veh.setName("Mercedes");
        return veh;
    }

}