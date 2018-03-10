//one D array approach with using nth row to store nth result.56991483520 is max number touched
//KEY realization: no need to search every number in the sequence, only serach for first n1<n - 18 mins to run  
//Even better realization: no need to ahve array till max n1. As we are only searching for previous counts of n<n1, array of 1million length is enough.
//use Long for n1 so program doesnt get stuck at 110383 but typecast to int wherever we are using n since n is always less than 1 M.

public class Problem14C
{

public static void main(String[] args)

{
long start,end;
start = System.currentTimeMillis();

long n=2,n1;
int count, max=0,maxnum=1;
int i=0;
int limit=1000000;
int []ref = new int[1000000];
boolean flag=false;
findcount f= new findcount();
//long n1max=0;
for(i=0;i<1000000;i++)
{
ref[i]=0;
}


do{
n1=n;count=1;flag=false;
	while(n1!=1)
	{
		if(n1%2==0) n1=n1/2;
		else	
			n1=(n1*3)+1;
		count++;
		if (n1<0) System.out.println("ERROR "+ n+" "+n1);
			if(n1<n)
			{
				flag=true;
				count=count+ref[(int)n1]-1;
				//if(n1==5) System.out.println("n "+n+" i "+i+"ref[i][1] "+ref[i][1]+" n1 "+n1+" count "+count);				
				
				//System.out.println("here with " + n1);
				n1=1;
				break;
				
			}
			
	}
ref[(int)n]=count;

//System.out.println("number : "+n+" count: "+count);

if (count>max) 
{
	max=count;
	maxnum=(int)n;
}


//if(n==110001)System.out.println(n+ " done"+" Timer: "+(System.currentTimeMillis()-start) +" count is" + count);
n++;
//if(n%100000==0)System.out.println(n+ " done"+" Timer: "+((System.currentTimeMillis()-start)/1000) +" count is " + count);

}while(n<limit);

System.out.println("number with longest chain is " + maxnum);
System.out.println("max chain length is " + max);
//System.out.println("max number functionran for is " + n1max);
end = System.currentTimeMillis();
//System.out.println("Elapsed time in Minutes: " + ((end-start)/1000/60));
System.out.println("\n Elapsed time in Msec: " + (end-start));
}
}