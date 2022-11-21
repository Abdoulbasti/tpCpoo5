public class MotComparable implements Comparable{
    public String mot;
    public MotComparable(String mot) {  this.mot = mot; }
    @Override
    public Object value() {
        return this.mot;
    }

    public boolean estPlusGrand(Comparable i)
    {
        if (i.value()) intanceof String
        {
            if (this.mot.compareTo((String).value() >0) return true;
            return false;
        }
        else
        {
            throw new IllegalArgumentException();
        }
    }
}
