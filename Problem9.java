public class Problem9
{

public static void main(String[] args)
{

int a=0,b=0,c=0,product=0;
boolean found=false;

for(a=500;a>0;a--)
{
	for(b=500;b>0;b--)
	{	//System.out.println((a+b+(Math.sqrt((a*a)+(b*b)));
		if((a+b+(Math.sqrt((a*a)+(b*b))))==1000)
			{
			c=1000-a-b;
			System.out.println("a,b,c are :"+ a +" "+ b +" "+c);
			found=true;
			//System.out.println(a+" "+b+" "+c);
			//System.out.println("Product is "+(a*b*c));
			product=a*b*c;
			//break;
			}
	if(found==true) break;
	}
}

if(found==false)System.out.println("Not found");
if(found==true)System.out.println("Product is "+product);

}

}
