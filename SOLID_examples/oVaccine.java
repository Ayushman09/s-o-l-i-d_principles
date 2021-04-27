package zemoso_training;

public interface Vaccine
{

    public char nameOfUser;
    public int age;
    public char date;
    public List<Object> dosageDetails();
}
public class Covaxin implements Vaccine
{

    public List<Object> dosageDetails()
    {
        return Arrays.asList(nameOfUser, age, date);
    }
}
public class AstraZeneca implements Vaccine
{

    public List<Object> dosageDetails()
    {
        return Arrays.asList(nameOfUser, age, date);
    }
}
public class dosageDetails
{
    public static List<Object> returnDosageDetails(Vaccine v)
    {
        return v.dosageDetails();
    }
}

