/* for loop trial */

public class ForLoop 
{
 
    public static void main(String[] args) 
	{
	int i,j;
		for(i=0;i<10;i++)
		{
        	System.out.print("Current value of i is " + i + " ");
			for(j=0;j<=i;j++)
			{
			System.out.print("*");
			}
		System.out.println("");
		}
	}
}