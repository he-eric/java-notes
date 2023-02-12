package solutions.item10.symmetry;

import java.util.Objects;

public final class CaseInsensitiveStringSolution {

    private final String s;

    public CaseInsensitiveStringSolution(String s) {
        this.s = Objects.requireNonNull(s);
    }

    @Override
    //Fixed by removing String interoperability!
    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveStringSolution) {
            return s.equalsIgnoreCase(((CaseInsensitiveStringSolution)o).s);
        }
        return false;
    }

}
