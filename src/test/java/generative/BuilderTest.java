package generative;

import org.example.generative.Builder.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuilderTest {

    @Test
    public void test() {
        BuilderService service = new BuilderService();
        service.exec();
    }

    @Test
    public void serviceTest() {
        CarBuilder builder = new CarBuilder();
        builder.setGPSNavigator(new GPSNavigator("Home"));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1,100));
        builder.setTripComputer(new TripComputer());
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(4);
        Car car = builder.getResult();
        car.setFuel(80);

        assertEquals("Home", car.getGpsNavigator().getRoute());
        assertEquals(80, car.getFuel());
        assertEquals(4, car.getSeats());
        assertEquals(CarType.CITY_CAR, car.getCarType());
        assertEquals(Transmission.AUTOMATIC, car.getTransmission());
    }
}
