package sti.abstractions.test.unit;

import org.junit.Assert;
import org.junit.Test;
import sti.abstractions.domain.Owl;

public class TestOwl    {

    @Test
    public void owlConstructorTes(){
        Owl owl = new Owl(90,true, 3000, "Name");
        Assert.assertEquals(90, owl.getWingSpan());




    }
}
