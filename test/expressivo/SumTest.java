package expressivo;

import static org.junit.Assert.*;

import org.junit.Test;



public class SumTest {

    @Test
    public void testToString() {
        Expression num1 = new Number(2);
        Expression num2 = new Number(3);
        Expression sum = new Sum(num1, num2);

        assertEquals("2.0 + 3.0", sum.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        Expression sum1 = new Sum(new Number(1), new Variable("x"));
        Expression sum2 = new Sum(new Number(1), new Variable("x"));
        Expression sum3 = new Sum(new Number(1), new Variable("y"));

        assertEquals(sum1, sum2);
        assertNotEquals(sum1, sum3);

        assertEquals(sum1.hashCode(), sum2.hashCode());
        assertNotEquals(sum1.hashCode(), sum3.hashCode());
    }

    @Test
    public void testNestedSum() {
        Expression sum1 = new Sum(new Number(1), new Sum(new Variable("x"), new Number(2)));
        Expression sum2 = new Sum(new Number(1), new Sum(new Variable("x"), new Number(2)));

        assertEquals(sum1, sum2);
        assertEquals("1.0 + x + 2.0", sum1.toString());
    }
}
