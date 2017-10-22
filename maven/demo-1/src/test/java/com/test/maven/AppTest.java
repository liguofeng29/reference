package com.test.maven;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {

    public void testMain() {
        App.main(new String[]{});

    }

    public void testNew() {
        App app = new App();
    }
}
