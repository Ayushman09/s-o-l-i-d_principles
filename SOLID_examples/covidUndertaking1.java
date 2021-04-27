package zemoso_training;

public class covidUndertaking1 {
    public void signUndertakingForm(User user)
    {
        if(Test.userTested(user))
            System.out.println("Allowed to sign");
	    else
	        System.out.println("Not Allowed to sign");
    }
}
public class Test
{
    public static boolean userTested(User user)
    {
        //test user , return false if Covid -ve, else +ve
        return false;
    }
}
