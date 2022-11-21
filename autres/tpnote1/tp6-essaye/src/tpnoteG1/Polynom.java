package tpnoteG1;

import java.util.List;

public interface Polynom {


    static Polynom constant(int a) {
        return null; /* à implémenter */
    }

    static Polynom x() {
        return null; /* à implémenter */
    }

    static Polynom plus(Polynom p, Polynom q) {
        return null; /* à implémenter */
    }

    static Polynom times(Polynom p, Polynom q) {
        return null; /* à implémenter */
    }

    int value(int x);

    List<Integer> develop();
}
