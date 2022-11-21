public interface Sequencable {
    public int longeur(); // Renvoie la longueur de la sequence
    public Comparable get(int i); // Renvoie le ieme objet de la sequence
    public void echange(int i, int j); // Echange le ieme object avec le jieme objet
    default void affiche() /*Implementation de la methode par defaut*/
    {
        String s = get(0).value().toString();
        for(int i =0; i<longeur(); i++)
        {
            s+=", " +get(i).toString();
        }
        System.out.println("["+ s+ "]");
    }

    default void triBulle()
    {
        boolean change = false;
        do
        {
            change = false;
            for(int i=0; i<longeur()-1; i++)
            {
                echange(i, i++);
                change = true;
            }
        }while (change);
    }
}