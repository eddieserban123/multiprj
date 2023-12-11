package com.mercuria.multiprj.math;

import org.junit.Assert;
import org.junit.Test;


public class GeometryTest {

    @Test
    public void test1(){
        Geometry g = new Geometry();
        Assert.assertFalse(3.0==g.length(1,1,3,3));
    }
}
