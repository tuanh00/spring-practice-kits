package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
    public static void main(String[] args) {


        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //Vehicle veh1 = context.getBean("vehicle1", Vehicle.class);
        //System.out.println("Vehicle name from Spring Context is: " + veh.getName());

        Vehicle veh1 = context.getBean("audi", Vehicle.class);
        System.out.println("veh1.getName() = " + veh1.getName());

        Vehicle veh2 = context.getBean("hyundai", Vehicle.class);
        System.out.println("veh2.getName() = " + veh2.getName());

        Vehicle veh3 = context.getBean("mercedes", Vehicle.class);
        System.out.println("veh3.getName() = " + veh3.getName());

    }
}
