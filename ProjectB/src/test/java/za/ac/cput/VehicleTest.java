package za.ac.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Integer.parseInt;
import static org.junit.Assert.assertEquals;


public class VehicleTest {

    private Vehicle vehicle;

    @Before
    public void setUp() throws Exception {

        vehicle =  new Vehicle();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void coverAmount() throws Exception {

        double amount = (new Vehicle().coverAmount(500000.00));
        assertEquals(75000, amount, 0);



    }

}