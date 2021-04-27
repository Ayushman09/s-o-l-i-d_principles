package zemoso_training;

//code following the rule
abstract class Vaccine
{
    abstract float effectiveness();
    abstract int noOfDosages();
}

public class Covaxin extends Vaccine
{
    public float cost;
    public float effectiveness()
    {return 0.75F;}
    public int noOfDosages()
    {return 2;}
}
