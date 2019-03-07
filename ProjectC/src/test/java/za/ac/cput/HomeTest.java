package za.ac.cput;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nelly on 3/7/2019.
 */
public class HomeTest {

    private Home home;
    @Before
    public void setUp() throws Exception {

        home = new Home();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void coverAmount() throws Exception {

        double amount = new Home().coverAmount(750000);
        assertEquals(120000, amount, 0);
    }

}