import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    public void setUp() {
        car = new Car("Toyota", "Land Cruiser", 2008);
        motorcycle = new Motorcycle("Suzuki", "SV650X", 2018);
    }

    @Test
    public void testCarIsInstanceOfVehicle() {
        assertInstanceOf(Vehicle.class, car);
    }

    @Test
    public void testCarFourWheels() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    public void testMotoTwoWheels() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    public void testCarSpeed() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    public void testMotorcycleSpeed() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    public void testCarPark() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    public void testMotorcyclePark() {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}
