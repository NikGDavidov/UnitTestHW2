package test.seminars.second.hw;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminars.second.hw.Motorcycle;

public class MotorcycleTest {
    Motorcycle motorcycle;

    @BeforeEach
    public void setUp(){
        motorcycle= new Motorcycle("testCompany","testModel",9999);
    }
    @Test
    public void testWheelsNumber(){
        assertEquals(2,motorcycle.getNumWheels());
    }
    @Test
    public void testSpeed(){
        motorcycle.testDrive();
        assertEquals(75,motorcycle.getSpeed());
    }
    @Test
    public void testPark(){
        motorcycle.park();
        assertEquals(0,motorcycle.getSpeed());
    }

}
