public class Problem10
{

/* Bytheloglogic og project euler*/

public static void main(String[] args)
{
long start,end;
start = System.currentTimeMillis();

	int num=2000000,i;
	long sum=0;
	int primes[] = new int[200000];
	//int a[] = new int[20];
	isprime a= new isprime();


	for(i=2;i<=num;i++)
	{
		if(a.isprime(i)== true) 
		{	
		sum=sum + i;
		}
	}

	System.out.println("Sum is " + sum);

end = System.currentTimeMillis();
System.out.println("Elapsed time: " + (end-start));

}

}