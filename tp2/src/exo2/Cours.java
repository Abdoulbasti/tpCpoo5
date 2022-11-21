package exo2;

import java.util.HashSet;
class Cours {
    private String nom;
    private HashSet<Personne> inscrits;

    public Cours(String nom, HashSet<Personne> inscrits) {
        this.nom = nom;
        this.inscrits = inscrits;
    }

    //return false si pas dans la liste
// des inscrits au départ
    public boolean exclut(Personne p) {
        return inscrits.remove(p);
    }
    public boolean inscrit(Personne p) {
        return inscrits.add(p);
    }

    @Override
    public String toString() {
        StringBuilder builder = (new StringBuilder()).append(nom); //Taille de chaine à stocker est de 16 charactere
        for (Personne p : inscrits) {
            builder.append("\n").append(p); //Les personnes p seront utiliser dans leur format toString.
        }
        return builder.toString();
    }
}

//return false si déjà dans liste
// des inscrits au départ