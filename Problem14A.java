//two D array approach

public class Problem14A
{

public static void main(String[] args)

{
long start,end;
start = System.currentTimeMillis();

int n=1,n1,count, limit=4000,max=0,maxnum=5,i=0,j=0;
int [][] ref = new int[4000000][2];
boolean flag=false;

for(i=0;i<4000000;i++)
{
ref[i][0]=0;
ref[i][1]=0;
}
//try
//{
do{
n1=n;count=1;flag=false;

	do{
	if(ref[n1][0]==1) 
	{
		count=count+ref[n1][1]-1;
		flag=true;
//		System.out.println("here with " + n1);
//		System.out.println("number : "+n+" count: "+count);
		n1=1;
	}
	else
	{
		if(n1%2==0) 
			n1=n1/2;
		else
			n1=(n1*3)+1;
//			System.out.print(n1+ " ");
	count++;
	}

}while(n1!=1);

if(n1==1 | flag==true)
{
ref[n][0]=1;
ref[n][1]=count;
//System.out.println("number : "+n+" count: "+count);
}
if (count>max) 
{
max=count;
maxnum=n;
}
n++;
if(n%50000==0) System.out.println(n+ " done"+" count: "+count);
}while(n<limit);
//}catch 

//System.out.println("number is " + (n-1));
System.out.println("number with longest chain is " + maxnum);
System.out.println("max chain length is " + max);

end = System.currentTimeMillis();
System.out.println("Elapsed time in Minutes: " + ((end-start)/1000/60));
System.out.println("\n Elapsed time in Msec: " + (end-start));
}
}