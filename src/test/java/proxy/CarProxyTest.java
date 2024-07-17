package proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarProxyTest {
    private CarProxy cp = new CarProxy();
    @BeforeEach
    public void setup() {
        Driver d = new Driver(26, "shubham", true);
        cp.setDriver(d);
    }
    @Test
    public void testProxy(){
        cp.driveCar();
        assertEquals(26, cp.getDriver().age);
    }
}
