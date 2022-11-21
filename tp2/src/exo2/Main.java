package exo2;

import java.util.HashSet;
public class Main {
    public static void main(String[] args) {

        //on crée un certain nombre de personnes:
        Personne p1 = new Personne("Adèle", 1254);
        Personne p2 = new Personne("Brian", 1287);
        Personne p3 = new Personne("Coralie", 2546);
        Personne p4 = new Personne("Désiré", 2546);

        //on crée un groupe de copains:
        HashSet copains = new HashSet<Personne>();
        copains.add(p1);
        copains.add(p2);
        copains.add(p3);

        //pour ce groupe, on crée cours:
        Cours couture = new Cours("Couture", copains);
        Cours karate = new Cours("Karate", copains);

        //Coralie est exclue du cours de Couture
        couture.exclut(p3);

        //Désiré s'inscrit à celui de Karaté
        karate.inscrit(p4);

        //Adèle change de prénom, parce que
        // l'ancien ne lui plaisait pas
        p1.changeNom("Adeline");
        System.out.printf("%s\n\n%s", couture, karate); //Affichage des gent inscrit au cours de couture et karate
    }
}