/**
 * @author Amit
 *Problem 5

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

 */
public class Problem5 
{

	public static void main(String[] args) 
	{
		int i, num = 21,sum = 0;
		int flag[] = new int[20];
		//boolean flagF;
		int factors[] = {11,12,13,14,15,16,17,18,19,20};
		long start,end;
		start = System.currentTimeMillis();	
		
		for(num=21;sum != 10;num++)
		{
		sum=0;
		//System.out.println("in here "+ num);
				for(i=0,flag[i]=0;i<10;i++)
				{
					//System.out.println(factors[i]);
					if(num%factors[i] != 0) 
					{
						flag[i]=0;
						//System.out.println("breaking out "+ num);
						break;
					}
					else flag[i] = 1;
					sum = sum + flag[i];
					//System.out.println(sum);
				}
		if (sum == 10) 
			{
			System.out.println("min integer divisible by 1-20 is "+ num);
			break;
			}
		}
		System.out.println("min integer divisible by 1-20 after loop is "+ num);
		end = System.currentTimeMillis();
		System.out.println("Elapsed time: " + (end-start));
	}

}