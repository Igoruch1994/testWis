package com.rbc.one;

import com.rbc.two.TestTwoService;

public class TestOneService {

    public static String one() {
        final String two = TestTwoService.two();
        return "One" + two;
    }


}
