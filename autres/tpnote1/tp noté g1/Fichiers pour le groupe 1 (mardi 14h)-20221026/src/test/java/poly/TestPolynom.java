package poly;

import java.util.List;
import java.util.Objects;

import static poly.Polynom.*;

public class TestPolynom {
    public static void main(String[] args) {
        System.out.println("Construction P(X)=(X+2)(X-3)");
        var p = times(plus(x(), constant(2)), plus(x(), constant(-3)));
        System.out.println("Construction Q(X)=(X+2)*3");
        var q = times(plus(x(), constant(2)), constant(3));
        System.out.println("Vérification toString sur P, doit afficher (X + (2))(X + (-3))");
        assertEquals(p.toString(), "(X + (2))(X + (-3))");
        System.out.println("Vérification toString sur Q, doit afficher (X + (2))(3)");
        assertEquals(q.toString(), "(X + (2))(3)");
        System.out.println("évaluation de P en -2 (doit valoir 0)");
        assertEquals(p.value(-2), 0);
        System.out.println("évaluation de P en 3 (doit valoir 0)");
        assertEquals(p.value(3), 0);
        System.out.println("évaluation de P en 1 (doit valoir -6)");
        assertEquals(p.value(1),-6);
        System.out.println("développement de P (doit valoir X^2-X-6)");
        assertEquals(p.develop(), List.of(-6, -1, 1));
        System.out.println("Tous les tests ont été passés avec succès !");
    }

    private static void assertEquals(Object obtained, Object expected) {
        if (!Objects.equals(obtained, expected))
            throw new Error(String.format("Test failed: obtained %s instead of %s.", obtained, expected));
    }
}
