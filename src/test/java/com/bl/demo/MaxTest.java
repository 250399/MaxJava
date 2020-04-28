package com.bl.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {
    Max maxObject;

    @Before
    public void init(){
        maxObject = new Max();
    }

    @Test
    public void testPasses_ForInteger_WhenReturnsMaximum(){
        int result=maxObject.getMaximum(new Integer[]{2,5,10});
        Assert.assertEquals(10, result);
    }

    @Test
    public void testPasses_ForFloat_WhenReturnsMaximum(){
        Assert.assertEquals(10.7f, maxObject.getMaximum(new Float[]{2.3f,5.2f,10.7f}),0);
    }

    @Test
    public void testPasses_ForString_WhenReturnsMaximum(){
        Assert.assertEquals("xyz", maxObject.getMaximum(new String[]{"abc","pqr","xyz"}));
    }

}