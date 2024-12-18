package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyMainClassTest {

    @Test
    public void testSum() {
        MyMainClass myClass = new MyMainClass();
        int result = myClass.sum(2, 3);
        assertEquals(5, result);
    }
}
