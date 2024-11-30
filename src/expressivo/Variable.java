package expressivo;

/**
 * Represents a variable in an expression.
 */
public class Variable implements Expression {
    private final String name;

    // Abstraction Function:
    //   Represents the variable by its name.
    // Representation Invariant:
    //   name is a nonempty string consisting of only letters.
    // Safety from Rep Exposure:
    //   All fields are private and final.

    public Variable(String name) {
        this.name = name;
        checkRep();
    }

    private void checkRep() {
        assert name.matches("[a-zA-Z]+");
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Variable)) return false;
        Variable that = (Variable) obj;
        return this.name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
