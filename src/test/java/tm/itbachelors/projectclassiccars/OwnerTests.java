package tm.itbachelors.projectclassiccars;

import tm.itbachelors.projectclassiccars.model.Owner;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class OwnerTests {

//    /**
//     * Test of constructor en getters
//     */
//    @Test
//    public void testConstructorEnGetters() {
//
//        Owner owner = new Owner("Donald", "Duck");
//        assertEquals("Donald", owner.getFirstName());
//        assertEquals("Duck", owner.getSurName());
//        assertEquals("undefined", owner.getCarCode());
//        assertEquals(0, owner.getYearOfBirth());
//    }
//
//    /**
//     * Test of setFirstName method, of class Owner.
//     */
//    @Test
//    public void testSetFirstName() {
//        Owner owner = new Owner("Donald", "Duck");
//        owner.setFirstName("Mickey");
//        assertEquals("Mickey", owner.getFirstName());
//    }
//
//    /**
//     * Test of setSurName method, of class Owner.
//     */
//    @Test
//    public void testSetSurName() {
//        Owner owner = new Owner("Donald", "Duck");
//        owner.setSurName("Mouse");
//        assertEquals("Mouse", owner.getSurName());
//    }
//
//    /**
//     * Test of setCarCode method, of class Owner.
//     */
//    @Test
//    public void testSetCarCode() {
//        Owner owner = new Owner("Donald", "Duck");
//        owner.setCarCode("undefined");
//        assertEquals("undefined", owner.getCarCode());
//    }
//
//    /**
//     * Test of setYearOfBirth of class Owner.
//     */
//    @Test
//    public void testSetYearOfBirth() {
//        Owner owner = new Owner("Donald", "Duck");
//        owner.setYearOfBirth(2015);
//        assertEquals(2015, owner.getYearOfBirth());
//    }
//
//    /**
//     * check basic functionality of Owner: constructor, setters/getters and
//     * adding wish to wishlist
//     */
//    @Test
//    public void testWishListBasics() {
//        Owner owner = new Owner("Donald", "Duck");
//        assertEquals(0, owner.getNumberOfWishes());
//        assertTrue(owner.addToWishList("Volkswagen - Beetle"));
//        assertEquals(1, owner.getNumberOfWishes());
//    }
//
//    /**
//     * Owner can add maximum 5 wishes names to wishlist
//     */
//    @Test
//    public void testWishListMax5() {
//        Owner owner = new Owner("Donald", "Duck");
//        assertEquals(0, owner.getNumberOfWishes());
//        assertTrue(owner.addToWishList("Volkswagen - Beetle"));
//        assertEquals(1, owner.getNumberOfWishes());
//        assertTrue(owner.addToWishList("Jaguar - E-Type"));
//        assertEquals(2, owner.getNumberOfWishes());
//        assertTrue(owner.addToWishList("Mercedes-Benz - 300SL"));
//        assertEquals(3, owner.getNumberOfWishes());
//        assertTrue(owner.addToWishList("Dodge - Charger"));
//        assertEquals(4, owner.getNumberOfWishes());
//        assertTrue(owner.addToWishList("Buick - Riviera"));
//        assertEquals(5, owner.getNumberOfWishes());
//        assertFalse(owner.addToWishList("Chrysler - Newport"));
//        assertEquals(5, owner.getNumberOfWishes());
//    }
//
//    /**
//     * Test of toString method, of class Owner.
//     */
//    @Test
//    public void testToString() {
//        Owner donald = new Owner("Donald", "Duck");
//        donald.setCarCode("undefined");
//        assertEquals("Owner DUCK Donald with car code undefined", donald.toString());
//    }

}
