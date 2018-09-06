package com.example.demo;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Euler2Test {

    @Test
    public void shouldReturnTruefor3(){

        //given
        int check = 9699690;
        //when
        boolean flag = check % 3 == 0;
        //then
        Assert.assertThat(check % 3 == 0, CoreMatchers.is(true));

    }

    @Test
    public void shouldReturnTrueForAll(){

        //given
        int check = 9699690;
        //when
        boolean flag = check % 3 == 0;
        //then
        Assert.assertThat(check % 3 == 0 && check % 5 ==0 && check % 2 ==0 && check % 7 ==0 && check % 11 ==0 && check % 13 == 0 && check % 17 ==0 && check % 19 ==0, CoreMatchers.is(true));

    }

}
