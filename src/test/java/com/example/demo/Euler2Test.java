package com.example.demo;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Euler2Test {
    private Euler2 euler2;

    @Before
    public void init(){
        euler2 = new Euler2();
    }
    @Test
    public void shouldReturn2520for10(){

        //given
        int check = 10;
        //when
        int result = euler2.check(10);
        //then
        Assert.assertThat(result, CoreMatchers.is(2520));

    }

    

}
