package com.alamin.SpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
      // Vehical obj=(Vehical)context.getBean("bike");
      // obj.drive();
       
       
      // Tyre tyre=(Tyre) context.getBean("tyre");
      // System.out.println(tyre);
       
       Car car=(Car)context.getBean("car");
       car.drive();
    }
}
