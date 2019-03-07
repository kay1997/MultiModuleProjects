package za.ac.cput;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class BusinessTest {

    private Business business;

    @Before
    public void setUp() throws Exception {

        business = new Business();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void coverAmount() throws Exception {

        double amount = new Business().coverAmount(1200000);
        assertEquals(240000, amount, 0);
    }

}