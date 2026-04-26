package tm.itbachelors.projectclassiccars;

import tm.itbachelors.projectclassiccars.model.Maintenance;
import tm.itbachelors.projectclassiccars.model.Staff;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
public class MaintenanceTests {

    // Test the no-arg constructor
    @Test
    public void testConstructorEnGetters() {
        Maintenance m = new Maintenance();
        assertNull(m.getType());
        assertEquals(0, m.getDuration());
        assertEquals(0.0, m.getHourlyRate());
        assertNull(m.getResponsible());
    }

    // Test the constructor with just type
    @Test
    public void testConstructorWithType() {
        Maintenance m = new Maintenance("Oil Change");
        assertEquals("Oil Change", m.getType());
        assertEquals(0, m.getDuration());
        assertEquals(0.0, m.getHourlyRate());
    }

    // Test the constructor with type and duration
    @Test
    public void testConstructorWithAll() {
        Maintenance m = new Maintenance("Tire Rotation", 120);
        assertEquals("Tire Rotation", m.getType());
        assertEquals(120, m.getDuration());
        assertEquals(0.0, m.getHourlyRate());
    }

    // Test setType
    @Test
    public void testSetType() {
        Maintenance m = new Maintenance();
        m.setType("Brake Check");
        assertEquals("Brake Check", m.getType());
    }

    // Test setDuration
    @Test
    public void testSetDuration() {
        Maintenance m = new Maintenance();
        m.setDuration(90);
        assertEquals(90, m.getDuration());
    }

    // Test setHourlyRate
    @Test
    public void setHourlyRate() {
        Maintenance m = new Maintenance();
        m.setHourlyRate(30.0);
        assertEquals(30.0, m.getHourlyRate());
    }

    // Test getPrice: price = hourlyRate * duration / 60
    @Test
    public void testGetPrice() {
        Maintenance m = new Maintenance("Oil Change", 60);
        m.setHourlyRate(25.0);
        // 25.0 * 60 / 60 = 25.0
        assertEquals(25.0, m.getPrice());

        Maintenance m2 = new Maintenance("Big Job", 120);
        m2.setHourlyRate(30.0);
        // 30.0 * 120 / 60 = 60.0
        assertEquals(60.0, m2.getPrice());
    }

    // Test setResponsible (association with Staff)
    @Test
    public void testResponsible() {
        Maintenance m = new Maintenance("Oil Change");
        assertNull(m.getResponsible());
        Staff s = new Staff("Jan", "Peeters");
        m.setResponsible(s);
        assertEquals("Jan", m.getResponsible().getFirstName());
        assertEquals("Peeters", m.getResponsible().getSurName());
    }
}