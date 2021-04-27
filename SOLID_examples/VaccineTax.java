package zemoso_training;

interface Tax
{
    int rebates();
    float calculateTax();
}
public class d2VaccineTax
{
    void calculateYearlyTax(Tax taxObj)
    {
        taxObj.calculateTax()
    }
}
class GSTtax implements Tax
{
    int rebates(){
        return 50;
    }
    float calculateTax(){
        return 100F;
    }
}
class SalesTax implements Tax
{
    int rebates(){
        return 10;
    }
    float calculateTax(){
        return 50F;
    }
}

