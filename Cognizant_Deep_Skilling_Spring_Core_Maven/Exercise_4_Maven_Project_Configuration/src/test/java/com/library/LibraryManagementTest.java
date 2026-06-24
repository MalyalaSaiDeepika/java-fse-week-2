package com.library;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

public class LibraryManagementTest {

    @Test
    public void testSpringContextLoads() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        assertNotNull(context);

        System.out.println("Spring Context Loaded Successfully");

        ((ClassPathXmlApplicationContext) context).close();
    }
}