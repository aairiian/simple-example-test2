package javafortesters.chapter005withourownclasses.domainobject.examples;


import org.junit.Assert;
import org.junit.Test;

import static javafortesters.domainobject.TestAppEnv.*;

;


public class TestAppEnvironment {

    @Test
    public void canGetUrlStatically () {
        Assert.assertEquals("Return correct URL", "http://127.0.0.1:4723", getUrl());
        System.out.println("Return URL is " + getUrl());
    }

    @Test
    public void canGetDomain (){
       Assert.assertEquals("Return DOMAIN use import static", "127.0.0.1", DOMAIN);
        System.out.println("Return DOMAIN use import of Assert " + DOMAIN);
    }

    @Test
    public void canGetPort (){
        Assert.assertEquals("Return PORT use import static", "4723", PORT);
        System.out.println("Return PORT use import static with decelerated constant field from another package " + PORT);
    }
}
