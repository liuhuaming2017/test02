package com.service.ffffff.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestFfffff {

        FfffffDelegate ffffffDelegate = new FfffffDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = ffffffDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}