class Problem7/*104743*/
{

public static void main(String[] args)
{
long start,end;
start = System.currentTimeMillis();

	int limit=10001,i,j=1;
	
	for(i=3;j<limit;i++)
	{
		//if(i==9)System.out.println("i= " +i + "calling for check");
		if(isprime(i)==true) 
		{
			j++;
			//if(i==29)System.out.println("i= " +i + "j= " + j);
			//if(i==31)System.out.println("i= " +i + "j= " + j);
		}
	}
	System.out.println("counter j is: " + j);
	System.out.println("jth prime number is " + --i);

end = System.currentTimeMillis();
System.out.println("Elapsed time: " + (end-start));

}



/* is prime method*/
static boolean isprime(int num)
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