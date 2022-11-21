package exo5;
import java.lang.Math;

//On met final devant la classe pour renforcer l'encapsulation, donc impossible de faire des modifs à travers l'heritage
public final class Complexe{
    private double reel, imaginaire;
    private final int zero = 0;
    private final int un = 1;
    private final String i = "i";
    public Complexe(double r, double i)
    {
        this.reel = r;
        this.imaginaire = i;
    }

    //Desction d'erreur, on ne peut pas avoir 2 constructeur ayant la meme signature, raison pour laquelle il faut passer par une fabrique static
    /*public  Complexe(double rho, double theta)
    {
        this.reel = rho*Math.cos(theta);
        this.imaginaire = rho*Math.sin(theta);
    }*/

    /*public String toString()
    {
        return +this.reel +"   " +this.imaginaire+i;
    }*/

    public Complexe somme(Complexe c)
    {
        Complexe result = new Complexe(0, 0); //initialisation de l'objet

        result.reel = this.reel + c.reel;
        result.imaginaire = this.imaginaire + c.imaginaire;

        return result;
    }
    public Complexe soustraction(Complexe c)
    {
        Complexe result = new Complexe(0, 0); //initialisation de l'objet

        result.reel = this.reel - c.reel;
        result.imaginaire = this.imaginaire - c.imaginaire;

        return result;
    }
    public Complexe multiplication(Complexe c)
    {
        Complexe result = new Complexe(0, 0); //initialisation de l'objet

        result.reel =(this.reel*c.reel) - (this.imaginaire*c.imaginaire);
        result.imaginaire = (this.reel*c.imaginaire) + (this.imaginaire*c.reel);

        return result;
    }

    public Complexe division( Complexe c)
    {
        Complexe result = new Complexe(0, 0);
        this.multiplication(c.conjugaison()) ;
        double denominateur = (Math.pow(c.reel, 2.0) +Math.pow(c.imaginaire, 2.0));

        result.reel = this.reel/denominateur;
        result.imaginaire = this.imaginaire/denominateur;

        return result;
    }

    public Complexe conjugaison() // Fonctionnement : c.complexeConjugue()
    {
        return new Complexe(this.reel, -this.imaginaire);
    }


    public boolean equals(Object autre)
    {
        if (autre==null || !(autre instanceof Complexe)) return false;
        Complexe cAntre = (Complexe) autre;
        return (this.reel==cAntre.reel) && (this.imaginaire==cAntre.imaginaire);
    }

    public double getReel() {
        return this.reel;
    }
    public double getImaginaire()
    {
        return this.imaginaire;
    }


    public double module()
    {
        return Math.sqrt(Math.pow(this.reel, 2) + Math.pow(this.imaginaire, 2));
    }

    //L'argument d'un nombre complexe est en degré
    public double argument()
    {
        return Math.atan(this.reel/this.imaginaire);
    }


    /*
   Q2. C'est pas dans tous les nombres complexes que 0, 1 et i vont intervenir, donc le mot clé static n'est pas obligatoire
    * */

    //Fabrique static
    public static Complexe fromPolarCoordinates(double rho, double theta)
    {
        double reel = rho*Math.cos(theta);
        double imaginaire = rho*Math.sin(theta);

        return new Complexe(reel, imaginaire);
    }

    private static final Complexe UN = new Complexe(1, 0);
    private static final Complexe ZERO = new Complexe(0, 0);
    private static final Complexe I = new Complexe(0, 1);

    
}