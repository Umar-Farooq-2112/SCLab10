package expressivo;

import static org.junit.Assert.*;

import org.junit.Test;


public class VariableTest {

    @Test
    public void testToString() {
        Variable var = new Variable("x");
        assertEquals("x", var.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        Variable var1 = new Variable("x");
        Variable var2 = new Variable("x");
        Variable var3 = new Variable("y");

        assertEquals(var1, var2);
        assertNotEquals(var1, var3);

        assertEquals(var1.hashCode(), var2.hashCode());
        assertNotEquals(var1.hashCode(), var3.hashCode());
    }

    @Test
    public void testInvalidVariable() {
        assertThrows(AssertionError.class, () -> new Variable("123")); // Invalid variable name
        assertThrows(AssertionError.class, () -> new Variable("x1"));  // Invalid variable name
    }
}
