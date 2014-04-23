/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication17;

import junit.framework.TestCase;

/**
 *
 * @author Илья
 */
public class BrainfuckEngineTest extends TestCase {
    
    public BrainfuckEngineTest(String testName) {
        super(testName);
    }

    /**
     * Test of interpret method, of class BrainfuckEngine.
     */
    public void testInterpret() throws Exception {
        System.out.println("interpret");
        String str = "";
        BrainfuckEngine instance = null;
        instance.interpret(str);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
