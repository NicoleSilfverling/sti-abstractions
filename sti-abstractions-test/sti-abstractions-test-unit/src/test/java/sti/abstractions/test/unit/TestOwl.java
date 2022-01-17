package sti.abstractions.test.unit;

import org.junit.Assert;
import org.junit.Test;
import sti.abstractions.domain.Owl;

public class TestOwl    {

    @Test
    public void owlConstructorTest(){
        Owl owl = new Owl("Mr Owl", 90, true, 3.5);
        Assert.assertEquals(90, owl.getWingSpan());
    }
}
