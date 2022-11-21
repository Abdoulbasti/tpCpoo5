package exo1;

public class Main {
    public static void main(String[] args) {
         Point a = new Point(3, 5);
         Point b = new Point(11, 22);
         System.out.printf( "a=%s\n",a );
         //modifier a par une méthode static ?
         Point.modifPoint(a, b);

         //L'affichage se fait en passant par la methode toString de la classe Point
         System.out.printf("a=%s\n", a );
         Point o = new Point( -5, -5);
         //modifier o par b ?
         b.addOther(o);
         System.out.printf("o=%s\n",o);
         b.addThis(a);
         System.out.printf("b=%s\n", b);
    }
}