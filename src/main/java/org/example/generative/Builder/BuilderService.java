package org.example.generative.Builder;

public class BuilderService {
    public void exec() {
        CarBuilder builder = new CarBuilder();
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        // Дополнительные объекты Car
        CarBuilder builder2 = new CarBuilder();
        builder2.setCarType(CarType.CITY_CAR);
        builder2.setSeats(4);
        builder2.setEngine(new Engine(1.8, 0));
        builder2.setTransmission(Transmission.AUTOMATIC);
        builder2.setTripComputer(new TripComputer());
        builder2.setGPSNavigator(new GPSNavigator());
        Car car2 = builder2.getResult();

        CarBuilder builder3 = new CarBuilder();
        builder3.setCarType(CarType.SUV);
        builder3.setSeats(7);
        builder3.setEngine(new Engine(4.0, 0));
        builder3.setTransmission(Transmission.AUTOMATIC);
        builder3.setTripComputer(new TripComputer());
        builder3.setGPSNavigator(new GPSNavigator("Custom route"));
        Car car3 = builder3.getResult();

        System.out.println("\nAdditional cars created:");
        System.out.println("Car 2:\n" + car2);
        System.out.println("Car 3:\n" + car3);
    }
}