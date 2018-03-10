public class Problem5log
{

/* Bytheloglogic og project euler*/

public static void main(String[] args)
{
long start,end;
start = System.currentTimeMillis();
int num=20,i,j;
int primes[] = new int[20];
int a[] = new int[20];
//System.out.println("output of prime check for " + num + ": " + isprime(num));

for(i=2,j=0;i<=num;i++)
{
	if(isprime(i)== true) 
	{	
		primes[j]=i;
		j++;
	}
}

int result=1;
boolean check = true;
int limit = (int)Math.sqrt(num);
i=0;

while(primes[i] <= num & i<j)
{
a[i]=1;
if(check = true)
	{
	if(primes[i]<=limit) 
		a[i]= (int)(Math.log(num)/Math.log(primes[i]));
	else 
		check = false;
	}
result = result * (int)Math.pow(primes[i],a[i])	;
i++;
}

System.out.println("Result is :" + result);

end = System.currentTimeMillis();
System.out.println("Elapsed time: " + (end-start));

}

/* is prime method*/
static boolean isprime(int num)
{
	boolean primeflag = false;

	if (num == 1 | num == 2)
		{
		primeflag=true;	
		return primeflag;
		}

	else
	{
		for(int i=2;i<num;i++)
		{
		
			if(num%i==0)
				{
				primeflag = false;
				//return primeflag;
				break;
				}
			else
			primeflag=true;
		}
	}			
	return primeflag;
}

}