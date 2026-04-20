package tm.itbachelors.projectclassiccars;

import tm.itbachelors.projectclassiccars.model.Staff;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
public class StaffTests {

//    /**
//     * Test of constructor en getters
//     */
//    @Test
//    public void testConstructorEnGetters() {
//        Staff employee = new Staff("Mathieu", "Dupont");
//        assertEquals("Mathieu", employee.getFirstName());
//        assertEquals("Dupont", employee.getSurName());
//        assertFalse(employee.isSenior());
//        assertEquals(LocalDate.now(), employee.getStartDate());
//    }
//
//
//    /**
//     * Test1 of toString method, of class Staff.
//     */
//    @Test
//    public void testToString() {
//        Staff donald = new Staff("Donald", "Duck");
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        assertEquals("Staff member DUCK Donald is employed since " + LocalDate.now().format(dtf) , donald.toString());
//        Staff minnie = new Staff("Minnie", "Mouse");
//        minnie.setSenior(true);
//        assertEquals("Senior staff member MOUSE Minnie is employed since " + LocalDate.now().format(dtf) , minnie.toString());
//    }
//
//    /**
//     * Test2 of toString method, of class Staff.
//     */
//    @Test
//    public void testToString2() {
//        Staff donald = new Staff("Donald", "Duck");
//        donald.setStartDate(LocalDate.of(1999,2,25));
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        assertEquals("Staff member DUCK Donald is employed since " + donald.getStartDate().format(dtf) , donald.toString());
//    }

}
