package expressivo;

/**
 * Represents a numeric constant in an expression.
 */
public class Number implements Expression {
    private final double value;

    // Abstraction Function:
    //   Represents the constant numeric value of the expression.
    // Representation Invariant:
    //   value must be a finite double.
    // Safety from Rep Exposure:
    //   All fields are private and final.

    public Number(double value) {
        this.value = value;
        checkRep();
    }

    private void checkRep() {
        assert Double.isFinite(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Number)) return false;
        Number that = (Number) obj;
        return Double.compare(this.value, that.value) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(value);
    }
}
