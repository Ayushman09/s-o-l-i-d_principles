package zemoso_training;
/* 4) Interface Segregation Principle
        Do not force any client to implement an interface which is irrelevant to them */

//code Violating this rule
public interface newVaccineDetails
{
    public char name() ;
    public char colour();
    public char odour();
    public char orgName();
    public boolean isLaunched();
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

