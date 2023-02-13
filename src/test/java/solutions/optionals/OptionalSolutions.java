package solutions.optionals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Optional;

public class OptionalSolutions {

    /**
     * Create an empty optional
     */
    @Test
    void tc01() {
        Optional<String> optionalString = Optional.empty();
        Assertions.assertTrue(optionalString.isEmpty());
    }

    /**
     * Create an optional with a non-null value
     */
    @Test void tc02() {
        Optional<String> optionalString = Optional.of("string");
        Assertions.assertNotNull(optionalString.get());
    }

    /**
     * Create an optional that holds a null value
     */
    @Test void tc03() {
        Optional<String> optionalString = Optional.ofNullable(null);
        Assertions.assertTrue(optionalString.isEmpty());
    }

    /**
     * Transform the below code to use optional.ifPresent
     */
    @Test void tc04() {
        String string = null;
        Optional.ofNullable(string).ifPresent(System.out::println);
    }

    /**
     * Transform the below code to use optional.orElse
     */
    @Test void tc05() {
        String maybeString = null;
        String string = maybeString != null ? maybeString : "string";
    }

    /**
     * Transform the below code to chain filter and ifPresent
     */
    @Test void tc06() {
        String string = "string";
        if (string != null && "string".equals(string)) {
            System.out.println("ok");
        }
    }

    /**
     * Transform the below code to chain map, filter and ifPresent
     */
    @Test void tc07() {
        Map<String, String> map = Map.of("key1", "value1", "key2", "value2");
        Optional.of(map)
                .map(m -> m.get("key1"))
                .filter("value1"::equals)
                .ifPresent(System.out::println);
    }

    /**
     * Print out the string by using flatmap and if present
     */
    @Test void tc08() {
        Optional<Optional<String>> nestedOptionalString = Optional.of(Optional.of("string"));
        nestedOptionalString.flatMap(o -> o).ifPresent(System.out::println);
    }

}
