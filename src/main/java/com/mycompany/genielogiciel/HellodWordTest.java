package com.mycompany.genielogiciel;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author PapiBadr
 */
public class HellodWordTest {
    
    private HelloWord subject;
    
    @Before
    public void setup() {
        subject = new HelloWord();
    }
    @Test
    public void testGetMessage1() {
        assertEquals("Hello World!", subject.getMessage(null));
    }
    @Test
    public void testGetMessage2() {
        assertEquals("Hello mes amis!", subject.getMessage("Papisbadr"));
    }
    public void testSum() {
        assertEquals(10,subject.sum(4, 6));
    }
}
