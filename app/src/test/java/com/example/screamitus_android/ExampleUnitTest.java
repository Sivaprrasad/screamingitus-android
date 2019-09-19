package com.example.screamitus_android;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    //R1 - tests number of days >0
    //Day<=0 retuns -1
    @Test
    public int testNumberOfDays(int day){
        if (day<=0){
            return -1;
        }
        return day;
        assertEquals(day, "");
    }
}