public class countfact
{

public static int countfact(int num)
{

	int count,i;

	for(i=1,count=0;i<=Math.sqrt(num);i++)
	{
	if(num%i==0)count+=2;
	}
	if((Math.sqrt(num)*Math.sqrt(num))==num) count--;
	//System.out.println("count of factors of "+num+" is "+count);

	return count;
}
}
