class Fibosum2 
{
	public static void main(String[] args) 
	{
		int fibo[] = new int [4000000];
		int i = 2;
		long sum = 0;
		int fiboA=1;
		int fiboB=1;
		//System.out.println(fibo[i]);
		for(int sum= 0; fiboB<=4000000;)
		{

			fiboB = fiboA + fiboB;
			
			if (fiboB%2 ==0)
			{
			sum+=fiboB;
			}		

		//System.out.println(fibo[i]);
		//i++;
		}
		//}while(fibo[i-1] <= 4000000);
		
		System.out.println("sum of even fibo numbers < 4M is " + sum);
	}
}

