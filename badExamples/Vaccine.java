package zemoso_training;

/*Rule violating code
3)Liskov’s Substitution Principle
        Derived or child classes must be substitutable for their base or parent classes */

abstract class Vaccine
{
    abstract float effectiveness();
    abstract int noOfDosages();
}
public class BiologicalE extends Vaccine
{
    public float effectiveness()
    {
        throw new AssertionError("Trials Not yet passed");
    }
    public int noOfDosages()
    {return 2;}
}

