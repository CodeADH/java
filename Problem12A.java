//Answer:76576500
//Elapsed time original code: 1660621
//Elapsed time with improvement in count fact to only check till sqrt and double(adjusted for perfect sq): 547
//Elapsed time with improvement in main to reuse fact of previous calc: 0


public class Problem12A
{

public static void main(String[] args)

{
long start,end;
start = System.currentTimeMillis();
int num=1,num1=0,k=0,j=1,num2=0,limit=500;
countfact a=new countfact();
isprime b=new isprime();

do
{
j++;
//num=(j*(j+1))/2;
num+=j;
num1=num2;
if(j%2==0) 
	num2=a.countfact((j+1));
else 
	num2=a.countfact((j+1)/2);
k=num1*num2;
//System.out.println("num1= " + num1+ " num2= " +num2);
//System.out.println("count of factors of "+num+" is "+k+" and j="+j);
if(k>=limit)System.out.println("count of factors of "+num+" is "+k+" and j="+j);
}while(k<limit);

end = System.currentTimeMillis();
System.out.println("Elapsed time in Minutes: " + ((end-start)/1000/60));
System.out.println("Elapsed time in Msec: " + (end-start));
}


}

/*calc for num =3
num1=0;
num2=a.countfact(j+1);
k=num1*num2;
num=(j*(j+1))/2;
//System.out.println("num1= " + num1+ " num2= " +num2);
//System.out.println("count of factors of "+num+" is "+k+" and j="+j);*/

/*calc for num =6
j++;
num=(j*(j+1))/2;
num1=num2;
num2=a.countfact((j+1)/2);
k=num1*num2;
System.out.println("num1= " + num1+ " num2= " +num2);
System.out.println("count of factors of "+num+" is "+k+" and j="+j);

//calc for num =10
j++;
num=(j*(j+1))/2;
num1=num2;
num2=a.countfact((j+1));
k=num1*num2;
System.out.println("num1= " + num1+ " num2= " +num2);
System.out.println("count of factors of "+num+" is "+k+" and j="+j);
*/
