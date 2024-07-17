package proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class CarProxyMockTest {

    @InjectMocks
    private CarProxy cp = new CarProxy();

    @Mock
    private Driver d;

    @BeforeEach
    public void setup() {
        cp.setDriver(d);
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testProxy(){
        cp.driveCar();
        verify(d, times(1)).validate();
    }

}
