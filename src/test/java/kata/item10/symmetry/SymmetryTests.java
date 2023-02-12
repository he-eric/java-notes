package kata.item10.symmetry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SymmetryTests {

    /**
     * Fix this test by modifying the equals method in the CaseInsensitiveString class.
     * x.equals(y) == y.equals(x) should be true however it is returning false!
     */
    @Test void clearViolationOfSymmetry() {
        CaseInsensitiveString x = new CaseInsensitiveString("Polish");
        String y = "polish";
        System.out.println("x.equals(y) = " + x.equals(y));
        System.out.println("y.equals(x) = " + y.equals(x));
        Assertions.assertEquals(x.equals(y), y.equals(x));
    }

}
