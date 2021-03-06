package sti.abstractions.test.unit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sti.abstractions.domain.Owl;
import sti.abstractions.service.ForestService;

public class TestService {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:sti-abstractions-service.xml");

    private ForestService forestService;

    @Before
    public void before(){
        forestService = (ForestService) applicationContext.getBean("forestService");
    }

    @Test
    public void testForestServiceDependencyInjection(){

        Owl owl = forestService.createOwl(95, true, 3200, "Uggla");
        Assert.assertNotNull(owl);

    }
}
