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
        Assert.assertEquals(10, maxObject.getMaximum(new int[]{2,5,10}));
    }

}