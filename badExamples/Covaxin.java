package zemoso_training;

//Code which Violates 2) Open/Close Principle
//software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification
public class Covaxin
{
    public char nameOfUser;
    public int age;
    public char date;
}
class AstraZeneca
{
    public char nameOfUser;
    public int age;
    public char date;
}
public class dosagePrice
{
    public static List<Object> covaxinDosageInfo(Covaxin acc)
    {
        return Arrays.asList(acc.nameOfUser, acc.age, acc.date);
    }
    public static List<Object> azDosageInfo(AstraZeneca az)
    {
        return Arrays.asList(az.nameOfUser, az.age, az.date);
    }
}
