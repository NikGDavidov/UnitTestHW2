package test.seminars.second.hw;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminars.second.hw.Car;

public class CarTest {
    private Car car;

    @BeforeEach
    public void setUp(){
        car = new Car("testCompany","testModel",9999);
    }

    @Test
    public void testInstance(){
        assertTrue(car instanceof Car);
    }
    @Test
    public void testWheelsNumber(){
        assertEquals(4,car.getNumWheels());
    }

    @Test
    public void testSpeed (){
        car.testDrive();
        assertEquals(60,car.getSpeed());
    }

    @Test
    public void testPark(){
        car.park();
        assertEquals(0, car.getSpeed());
    }
}
