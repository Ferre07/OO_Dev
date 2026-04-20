package tm.itbachelors.projectclassiccars;

import tm.itbachelors.projectclassiccars.model.Maintenance;
import tm.itbachelors.projectclassiccars.model.Car;
import tm.itbachelors.projectclassiccars.model.Owner;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CarTests {
//
//    /**
//     * Test of constructor en getters
//     */
//    @Test
//    public void testConstructorEnGetters() {
//        Car porsche = new Car("Porsche", "911");
//        assertEquals("Porsche - 911", porsche.getName());
//    }
//
//    /**
//     * Test of set... methods, of class Car.
//     */
//    @Test
//    public void testSetVarious() {
//        Car porsche = new Car("Porsche", "911");
//        porsche.setBrand("Opel");
//        porsche.setType("Astra");
//        assertEquals("Opel - Astra", porsche.getName());
//        assertEquals(0, porsche.getKilometers());
//        porsche.setKilometers(100);
//        assertEquals(100, porsche.getKilometers());
//        porsche.setKilometers(50);
//        assertEquals(100, porsche.getKilometers());
//        porsche.setPhoto("click.jpeg");
//        assertEquals("click.jpeg", porsche.getPhoto());
//    }
//
//    /**
//     * check constructor of car + adding of maintenance check if you can
//     * find a maintenance by name
//     */
//    @Test
//    public void checkAddMaintenanceAndGetNumber() {
//        Car car1 = new Car("BMW", "200");
//        assertEquals(0, car1.getNumberOfMaintenances());
//        Maintenance maintenance = new Maintenance("New wheels");
//        car1.addMaintenance(maintenance);
//        assertEquals(1, car1.getNumberOfMaintenances());
//        Maintenance maintenance1 = new Maintenance("Lubing");
//        car1.addMaintenance(maintenance1);
//        assertEquals(2, car1.getNumberOfMaintenances());
//        Maintenance[] array = new Maintenance[2];
//        array[0] = maintenance;
//        array[1] = maintenance1;
//        assertArrayEquals(array, car1.getMaintenances().toArray());
//    }
//
//    /**
//     * Test of search by Name
//     */
//    @Test
//    public void testSearchMaintenancebyName() {
//        Car car2 = new Car("Ford", "Fiesta");
//        assertEquals(0, car2.getNumberOfMaintenances());
//        Maintenance maintenance = new Maintenance("Add spoiler");
//        car2.addMaintenance(maintenance);
//        assertEquals(1, car2.getNumberOfMaintenances());
//        Maintenance maintenance1 = new Maintenance("Add sound system");
//        car2.addMaintenance(maintenance1);
//        assertEquals(2, car2.getNumberOfMaintenances());
//        assertNotNull(car2.searchMaintenanceByType("Add spoiler"));
//        assertEquals(maintenance1.getType(), car2.searchMaintenanceByType("Add sound system").getType());
//        assertNull(car2.searchMaintenanceByType("Add wheel"));
//    }
//
//    /**
//     * before a Owner can make his reservations, he has to register to the
//     * Car as result of this registration he will receive a theme car code
//     */
//    @Test
//    public void testRegisterOwner() {
//        Owner owner1 = new Owner("Donald", "Duck");
//        Car opel = new Car("Opel", "Kadett");
//        opel.setKilometers(12345);
//        opel.registerOwner(owner1);
//        assertEquals("OP_KA_12345", owner1.getCarCode());
//        Owner owner2 = new Owner("Mickey", "Mouse");
//        opel.registerOwner(owner2);
//        assertEquals("OP_KA_12345", owner2.getCarCode());
//    }

}
