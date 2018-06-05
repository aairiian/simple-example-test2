package javafortesters.chapter005withourownclasses.domainobject.examples;

import javafortesters.domainobject.TestAppEnv;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAppEnvironment {

    @Test
    public void canGetUrlStatically () {
        assertEquals ("Return correct URL", "http://127.0.0.1:4723", TestAppEnv.getUrl());
        System.out.println("Return URL is " + TestAppEnv.getUrl());
    }
}
