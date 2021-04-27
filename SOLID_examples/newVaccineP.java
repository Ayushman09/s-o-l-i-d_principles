package zemoso_training;

//code which follows the principle
public interface newVaccineProperties
{
    public char name() ;
    public char colour();
    public char odour();
    public char orgName();
    public boolean isLaunched();
}
public interface newVaccineInfo
{
    public void efficiency();
    public int noOfDosages();
    public int daysBetweenDosages();
    public int daysTakentoEffect();
}
public class BiologicalE implements newVaccineDetails{
    public char name(){
        //implementation
    }
    public char colour(){
    //implementation
        }
    public char odour(){
    //...
        }
    public char orgName(){
    //...
        }
    public boolean isLaunched(){
    //...
    }
}
public class Covaxin implements newVaccineProperties,newVaccineInfo
{
//…
//as it is launched, it uses all available methods
}
