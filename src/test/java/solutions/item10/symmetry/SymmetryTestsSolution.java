package solutions.item10.symmetry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SymmetryTestsSolution {

    @Test void clearViolationOfSymmetry() {
        CaseInsensitiveStringSolution x = new CaseInsensitiveStringSolution("Polish");
        String y = "polish";
        System.out.println("x.equals(y) = " + x.equals(y));
        System.out.println("y.equals(x) = " + y.equals(x));
        Assertions.assertEquals(x.equals(y), y.equals(x));
    }

}
