public class findcount
{

public static int findcount(int n)
{
int n1=n,count=1;

do
{
if(n1%2==0) n1=n1/2;
else
n1=(n1*3)+1;
//System.out.print(n1+ " ");
count++;
}while(n1!=1);

return count;

}
}