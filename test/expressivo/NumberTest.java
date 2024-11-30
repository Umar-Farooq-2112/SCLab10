package expressivo;

import static org.junit.Assert.*;

import org.junit.Test;


public class NumberTest {

    @Test
    public void testToString() {
        Number num = new Number(3.14);
        assertEquals("3.14", num.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        Number num1 = new Number(5);
        Number num2 = new Number(5);
        Number num3 = new Number(2.718);

        assertEquals(num1, num2);
        assertNotEquals(num1, num3);

        assertEquals(num1.hashCode(), num2.hashCode());
        assertNotEquals(num1.hashCode(), num3.hashCode());
    }

    @Test
    public void testImmutability() {
        Number num = new Number(10);
        assertEquals("10.0", num.toString());

        // Ensure no modifications can be made to `num`
        Number newNum = new Number(20); // Creating a new instance
        assertEquals("10.0", num.toString()); // Original `num` remains unchanged
        assertEquals("20.0", newNum.toString()); // New instance is independent
    }
}
