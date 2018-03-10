public class Problem6 
{

	public static void main(String[] args) 
	{
		long start,end;
		start = System.currentTimeMillis();	
		int k=100,i;
		double result=0.0;
		int result1;
		double sum1=0.0,sum2=0.0;

		for(i=1;i<=100;i++)
		{
			sum1=sum1+i*i;	
			sum2=sum2+i;
		}
		System.out.println("sum1: " +sum1);
		System.out.println("sum2: " +sum2);
		result1 = (int)((sum2*sum2)-sum1);
		
		/*result= Math.pow(((k+1)/(2*fact(k-1))),2);*/
		System.out.println("Result is: "+ result1);
		//System.out.println("Fact is: "+ fact(99));

		end = System.currentTimeMillis();
		System.out.println("Elapsed time: " + (end-start));
	}

	public static double fact(int num)
	{
		double fact;
		if(num == 1) return 1;
		fact = num * fact(num-1);
		return fact;
	}

}

/*c:\java>java Problem6
sum1: 338350.0
sum2: 5050.0
Result is: 2.516415E7
Elapsed time: 16

c:\java>java Problem6
sum1: 338350.0
sum2: 5050.0
Result is: 25164150
Elapsed time: 16*/