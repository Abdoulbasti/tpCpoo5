import java.util.List;
public class Paire<X, Y> {
    public X gauche;
    public Y droite;

    public Paire(X gauche, Y droite) {
        this.gauche = gauche;
        this.droite = droite;
    }

    //Getters
    public Y getDroite() {
        return droite;
    }

    public X getGauche() {
        return gauche;
    }

    //Setters
    public void setDroite(Y droite) {
        this.droite = droite;
    }

    public void setGauche(X gauche) {
        this.gauche = gauche;
    }


    static <U extends Number, V extends Number> //Indication des type à utiliser dans les parametres
    Paire<Double, Double> //Type de retour
    somme(List<Paire<U, V>> aSommer) {
        double a = 0, b = 0;
        for (Paire<U, V> p : aSommer) {
            a += p.getGauche().doubleValue();
            b += p.getDroite().doubleValue();
        }

        return new Paire<Double, Double>(a, b);
    }

    //Question3
    Paire<Number, Number> x = new Paire<>(Integer.valueOf(5),
            Double.valueOf(6.0));
    //x = new Paire(Integer, Integer)(10, 20); -> non !!!


    Paire<Integer, Integer> y = new Paire<>(5, 6);


    //Question4
    

}
