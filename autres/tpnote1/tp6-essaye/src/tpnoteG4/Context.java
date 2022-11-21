package tpnoteG4;

import java.util.List;
import java.util.Map;

public class Context {
    public static class Formule /*à compléter*/ {
        /*à compléter*/
        private Formule()
        {

        }


        /*
        // à définir quand vous arrivez à la section 2.3.
        public Formule substitute(Map<String, Formule> substitution); */
    }

    /*à compléter*/

    public static Formule Variable(String name) {
        /*à implémenter*/

        return null;
    }


    public static Formule Value(boolean value) {
        /*à implémenter*/
        return null;
    }

    public static Formule And(List<Formule> arguments) {
        /*à implémenter*/
        return null;
    }

    public static Formule Or(List<Formule> arguments) {
        /*à implémenter*/
        return null;
    }

    public static Formule Neg(Formule argument) {
        /*à implémenter*/
        return null;
    }
}
