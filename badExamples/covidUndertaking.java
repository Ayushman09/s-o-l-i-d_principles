package zemoso_training;
/* 1)Single Responsibility Principle
        a class should have only one reason to change
Example of code which Violates */

public class s1covidUndertaking {
    public void signUndertakingForm(User user)
    {
        if(userTested(user))
        System.out.println("Allowed to sign");
	else
        //not allowed
            System.out.println("Not Allowed to sign");
    }
    public boolean userTested(User user)
    {
        //test user , return 1 if Covid +ve, else -ve
        return false;
    }
}
