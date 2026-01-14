package com.javatpoint;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
    public static void main(String[] args) {

        // Load XML file from classpath
    	Resource resource = new ClassPathResource("applicationContext.xml");


        // Create BeanFactory
        BeanFactory factory = new XmlBeanFactory(resource);

        // Get bean
        Student student = (Student) factory.getBean("studentbean");

        // Call method
        student.displayInfo();
    }
}
