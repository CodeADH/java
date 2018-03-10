public class isprime
{

/* is prime method*/
public static boolean isprime(int num)
{	
	boolean primeflag = false;

	if (num == 1 | num == 2 | num == 3 | num == 5 | num == 7)
	{
	primeflag=true;	
	return primeflag;
	}

	else
	{
	if(num%2 ==0)
		{
		primeflag = false;
		return primeflag;
		}
		
	else
	{			
		for(int i=3;i<(((int)Math.sqrt(num)+1));i=i+6)
		{
		
			if(num%i==0 | num%(i+2)==0 | num%(i+4)==0)
				{
				primeflag = false;
				//return primeflag;
				break;
				}
			else
			primeflag=true;
		}
	//if(num==11) System.out.println("11 called " + primeflag);
	return primeflag;	
	}		
	}
}

}