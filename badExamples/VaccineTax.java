package zemoso_training;
//5) Dependency Inversion Principle
//High-level modules/classes should not depend on low-level modules/classes. Both should depend upon abstractions
public class d1VaccineTax {
    void calculateYearlyTax()
    {
        if(mode = "GST")
            GSTtax.calculateTax();
        else if (mode = "SalesTax")
            SalesTax.calculateTax
    }
}
class GSTtax
{
    int rebates(){
        return 50;
    }
    float calculateTax(){
        return 100F;
    }
}
class SalesTax
{
    int rebates(){
        return 10;
    }
    float calculateTax(){
        return 50F;
    }
}
