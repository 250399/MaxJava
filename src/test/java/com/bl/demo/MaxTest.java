package com.bl.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void testPasses_ForInteger_WhenReturnsMaximum(){
        int result=new Max<>(new Integer[]{2,5,10}).getMaximum();
        Assert.assertEquals(10, result);
    }

    @Test
    public void testPasses_ForFloat_WhenReturnsMaximum(){
        Assert.assertEquals(10.7f, new Max<>(new Float[]{2.2f,3.5f,10.7f}).getMaximum(),0);
    }

    @Test
    public void testPasses_ForString_WhenReturnsMaximum(){
        Assert.assertEquals("xyz", new Max<>(new String[]{"abc","pqr","xyz"}).getMaximum());
    }

    @Test
    public void testPasses_WhenPassingValues_ThroughConstructor_ReturnsMaximum(){
        Max max = (Max) new Max(4,10,9);
        Assert.assertEquals(10,max.getMax());

    }

    @Test
    public void testPasses_WhenPassingValues_ThroughStringConstructor_ReturnsMaximum(){
        Max max = (Max) new Max("pqe","abc","xyz");
        Assert.assertEquals("xyz",max.getMax());
    }

    @Test
    public void givenVariableLengthArguments_ReturnsMaximum(){
        Assert.assertEquals(10,new Max().getMax(1,2,10,4,3));
    }
}