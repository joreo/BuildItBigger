package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import java.util.concurrent.TimeUnit;

public class JokeAsyncTest extends AndroidTestCase{

    public void testJokeRetrieval(){

        try {
            JokeAsync jokeAsync = new JokeAsync();
            jokeAsync.execute();
            String joke = jokeAsync.get(30, TimeUnit.SECONDS);

            assertNotNull(joke);
            assertTrue(joke.length() != 0);
        } catch (Exception e) {
            fail("Something is broken");
            //first break was a lack of multidex

        }
    }
}
