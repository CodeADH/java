//two D array approach without using nth row to store nth result. instead just 
//add as we go along and search entire array

public class Problem14B
{

public static void main(String[] args)

{
long start,end;
start = System.currentTimeMillis();

long n=2,n1,count, max=0,maxnum=1;
int i=0,j=0,limit=1000000;
long [][] ref = new long[limit][2];
boolean flag=false;
findcount f= new findcount();
long n1max=0;
for(i=0;i<ref.length;i++)
{
ref[i][0]=0;
ref[i][1]=0;
}


do{
n1=n;count=1;flag=false;
	while(n1!=1)
	{
		if(n1%2==0) n1=n1/2;
		else	
			n1=(n1*3)+1;
		count++;
		if (n1>n1max) n1max=n1;
			if(n1<n)
			{
			for(i=j;i>=0;i--)
			{
				if(ref[i][0]==n1) 
				{
				flag=true;
				/*if(n1!=1)*/count=count+ref[i][1]-1;
				//if(n1==5) System.out.println("n "+n+" i "+i+"ref[i][1] "+ref[i][1]+" n1 "+n1+" count "+count);				
				
				//System.out.println("here with " + n1);
				n1=1;
				break;
				}
			}
			}
	}
ref[j][0]=n;
ref[j][1]=count;
j++;
//System.out.println("number : "+n+" count: "+count);

if (count>max) 
{
	max=count;
	maxnum=n;
}


//if(n==110001)System.out.println(n+ " done"+" Timer: "+(System.currentTimeMillis()-start) +" count is" + count);
n++;
if(n%100000==0)System.out.println(n+ " done"+" Timer: "+((System.currentTimeMillis()-start)/1000) +" count is " + count);

}while(n<limit);

System.out.println("number with longest chain is " + maxnum);
System.out.println("max chain length is " + max);
System.out.println("max number functionran for is " + n1max);
end = System.currentTimeMillis();
System.out.println("Elapsed time in Minutes: " + ((end-start)/1000/60));
System.out.println("\n Elapsed time in Msec: " + (end-start));
}
}