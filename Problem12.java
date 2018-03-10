//Answer:76576500
//Elapsed time: 657

public class Problem12
{

public static void main(String[] args)

{
long start,end;
start = System.currentTimeMillis();
int num=1,k,j=1,num2,limit=500;
countfact a=new countfact();
isprime b=new isprime();

do
{
k=a.countfact(num);
j++;
if(k >= limit) System.out.println("count of factors of "+num+" is "+k+" and j="+j);
num=((j*(j+1))/2);

}while(k<limit);

end = System.currentTimeMillis();
//System.out.println("Elapsed time in Minutes: " + ((end-start)/1000/60));
System.out.println("Elapsed time in Msec: " + (end-start));


}
}

