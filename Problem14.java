public class Problem14
{

public static void main(String[] args)

{
long start,end;
start = System.currentTimeMillis();

long n=1,n1,count, limit=400000,max=0,maxnum=1;
int i=0,j=0;
long [][] ref = new long[7000000][2];
boolean flag=false;
findcount f= new findcount();

for(i=0;i<7000000;i++)
{
ref[i][0]=0;
ref[i][1]=0;
}

do{
count=f.findcount(n);

ref[j][0]=n;
ref[j][1]=count;
//System.out.println("number : "+n+" count: "+count);
}
if (count>max) 
{
max=count;
maxnum=n;
}
n++;
if(n%10000==0) System.out.println(n+ " done"+" Timer: "+(System.currentTimeMillis()-start);
}while(n<limit);
 
System.out.println("number with longest chain is " + maxnum);
System.out.println("max chain length is " + max);

end = System.currentTimeMillis();
System.out.println("Elapsed time in Minutes: " + ((end-start)/1000/60));
System.out.println("\n Elapsed time in Msec: " + (end-start));
}
}

