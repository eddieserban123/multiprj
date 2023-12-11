package com.mercuria.multiprj.processing;

import org.junit.Assert;
import org.junit.Test;
import processing.Tweets;

public class TweetsIT {

    @Test
    public void test1() {
        Tweets tweets = new Tweets();
        tweets.annalyze("Hi there");
        Assert.assertTrue(tweets.annalyze("Hi there").equalsIgnoreCase("nice msg"));

    }
}
