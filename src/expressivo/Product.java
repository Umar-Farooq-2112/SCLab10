package expressivo;

/**
 * Represents the product of two expressions.
 */
public class Product implements Expression {
    private final Expression left, right;

    // Abstraction Function:
    //   Represents the product of left and right expressions.
    // Representation Invariant:
    //   left and right are non-null.
    // Safety from Rep Exposure:
    //   All fields are private and final.

    public Product(Expression left, Expression right) {
        this.left = left;
        this.right = right;
        checkRep();
    }

    private void checkRep() {
        assert left != null;
        assert right != null;
    }

    @Override
    public String toString() {
        return left.toString() + " * " + right.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Product)) return false;
        Product that = (Product) obj;
        return this.left.equals(that.left) && this.right.equals(that.right);
    }

    @Override
    public int hashCode() {
        return left.hashCode() * right.hashCode();
    }
}
