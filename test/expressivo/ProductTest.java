package expressivo;

import static org.junit.Assert.*;

import org.junit.Test;


public class ProductTest {

    @Test
    public void testToString() {
        Expression num1 = new Number(2);
        Expression num2 = new Variable("x");
        Expression product = new Product(num1, num2);

        assertEquals("2.0 * x", product.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        Expression prod1 = new Product(new Number(1), new Variable("x"));
        Expression prod2 = new Product(new Number(1), new Variable("x"));
        Expression prod3 = new Product(new Number(1), new Variable("y"));

        assertEquals(prod1, prod2);
        assertNotEquals(prod1, prod3);

        assertEquals(prod1.hashCode(), prod2.hashCode());
        assertNotEquals(prod1.hashCode(), prod3.hashCode());
    }

    @Test
    public void testNestedProduct() {
        Expression product1 = new Product(new Number(3), new Product(new Variable("x"), new Number(2)));
        Expression product2 = new Product(new Number(3), new Product(new Variable("x"), new Number(2)));

        assertEquals(product1, product2);
        System.out.print(product1.toString());
        assertEquals("3.0 * x * 2.0", product1.toString());
    }
}
