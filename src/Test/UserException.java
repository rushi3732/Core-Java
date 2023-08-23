package Test;
class UserExceptionApp extends ArithmeticException
{
int age;
public void getVoterAge(int age)
{
	this.age=age;
}
public String errorMessage() {
	if(age<18)
	{
		return "you are not eligible for voting...............";
	}
	else if(age<0)
	{
		return "invalid age...............................";
	}
	else {
		return "You are eligiable for voteee........................";
	}
}

}


public class UserException {
	public static void main(String x[])
	{
		UserExceptionApp u=new UserExceptionApp();
		u.getVoterAge(0);
		
		try {
			String result=u.errorMessage();
			System.out.println(result);
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	
		
	}

}
