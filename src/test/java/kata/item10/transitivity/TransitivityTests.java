package kata.item10.transitivity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class TransitivityTests {

    /**
     * Fix this test by modifying the equals method in the CaseInsensitiveString class.
     * x.equals(y) == y.equals(x) should be true however it is returning false!
     */
    @Test void violationOfTransitivity() {
        ColorPoint x = new ColorPoint(1, 2, Color.RED);
        Point y = new Point(1, 2);
        ColorPoint z = new ColorPoint(1, 2, Color.BLUE);

        boolean xEqualsY = x.equals(y);
        boolean yEqualsZ = y.equals(z);
        boolean xEqualsZ = x.equals(z);

        System.out.println("x.equals(y) = " + xEqualsY);
        System.out.println("y.equals(z) = " + yEqualsZ);
        System.out.println("x.equals(z) = " + xEqualsZ);

        Assertions.assertTrue(xEqualsY);
        Assertions.assertTrue(yEqualsZ);
        Assertions.assertTrue(xEqualsZ);
    }

}
