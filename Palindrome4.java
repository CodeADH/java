
/*Problem 4
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.

method to find palindrome

get number as an arguemnt
create digits using  base 10.. Compare number and its reverse
IF equal then palindrome */

class Palindrome4
{

	public static void main(String[] args) 
	{
		int num = 876780054,a,b,max=0;
		long start,end;
		boolean result = false;
		start = System.currentTimeMillis();
		for(a=999;a>=100;a--)
		for(b=999;b>=a;b--)
			{
				{	
				if(ispalindrome(a*b) == true && a*b > max) 
					{
					//System.out.println(a+" "+b+ " "+a*b);	
					max = a*b;
					}
				}	
			}				
		System.out.println(max);
		end = System.currentTimeMillis();
		System.out.println("Elapsed time: " + (end-start));
	}

	public static boolean ispalindrome(int num)
	{
	int i,len = 0,rem,quo = 1;
	boolean pal_flag = false;
	int digits[] = new int[16];
	rem=num;
	//System.out.println(quo);		
	for(i=0;quo != 0;i++)
	 	{
		//System.out.println("in");		
		quo= rem/10;
		digits[i] = quo == 0 ? rem - (quo) : rem - (quo*10);
		rem = quo;
		if(quo == 0) len=i;
		//System.out.println(digits[i]);
		}
	//System.out.println(len);		
	
	for(i=0;i<=len/2;i++)
		{	
		if(digits[i] == digits[len-i])
		pal_flag= true;					
		else
			{
			pal_flag= false;					
			break;
			}
		}
	//System.out.println(pal_flag);		
	return pal_flag;
	}

}
//1234=10^0*4+10^1*3+10^2*2+10^3*1