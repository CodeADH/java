/*Find sum of numbers between 0 and 1000 divisible by 3 or 5 */
class Multiples
{
	public static void main(String[] args) 
	{
		int sum=0;
		for(int i=0; i<1000; i++)
		{
			if(i%3 == 0 | i%5 == 0) 
				sum=sum + i;
		}
		
		System.out.println("Sum of multiples of 3 or 5 is " + sum);
	}
}
