package hu.bme.mit.train.sensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;



public class TrainSensorTest {

    @Before
    public void before() {
        // TODO Add initializations
    }

    @Test
    public void ThisIsAnExampleTestStub() {


	TrainController controller;
	TrainUser user;
    TrainSensorImpl tsi=new TrainSensorImpl(controller, user);

	assertEquals(5,tsi.getSpeedLimit(), "default value must be 5");    


    }
}
