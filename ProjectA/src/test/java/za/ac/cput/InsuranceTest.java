package za.ac.cput;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/*
*Kaylen Abrahams
* Student Number: 216054664
* Group: 3G

*/

import static org.junit.Assert.*;


public class InsuranceTest {

    private Insurance insurance;
    @Before
    public void setUp() throws Exception {

        insurance = new Insurance();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void coverAmount() throws Exception {

        double amount = (new Insurance().coverAmount(800000.00));
        assertEquals(0, amount, 0);
    }


}