package factorialjava;

public class factoial{
	public static void main(String args[])
	{
		int i,fact=1;
		int number=7; //it is the number to calculate factorial
		for(i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of" +number+" is:"+fact);
			
		}
	}

	