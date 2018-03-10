public class Problem8
{

public static void main(String[] args)
{
long start,end;
start = System.currentTimeMillis();

String S = ("7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450");

//System.out.println(S);
//System.out.println(S.length());

int chardigit[] = new int[1000];
int asciiref[] ={48,49,50,51,52,53,54,55,56,57};
int decref[] ={0,1,2,3,4,5,6,7,8,9};
int i,j,k=0;
long product =0,max=0;

/*chardigit[0]=(int)S.charAt(0);
chardigit[1]=(int)S.charAt(1);
System.out.println("char 0 is" + chardigit[0]);
System.out.println(S.charAt(0));
System.out.println(chardigit[0]*chardigit[1]);
System.out.println(S.charAt(0)*S.charAt(1));*/

for(i=0;i<1000;i++)
{
	chardigit[i]=(int)S.charAt(i);
	for(j=0;j<=9;j++)
	{
		if(chardigit[i] == asciiref[j]) 
		{
		chardigit[i]=decref[j];
		break;
		}
	}
//System.out.println(chardigit[i]);
}

//System.out.println("char 0 is" + chardigit[0]);
//System.out.println(chardigit[0]*chardigit[1]);

for(i=0;i<(1000-12);i++)//1000-12
{

	for(j=i,product=1;j<(i+13);j++)
	{
//	System.out.println(chardigit[j]);
	product=product*chardigit[j];
	if(product == 0)break;
//	System.out.println(product);
	}

//if(product == 0)System.out.println("product in iteration with i = "+ i + " is " + product);

if(product>max) 
{
max=product;
k=i;

}

}

System.out.println("Max product is " + max);
System.out.println("Values of digits for max product are ");
	for(i=k;i<(k+13);i++)
	{
	System.out.print(chardigit[i]);
	}
end = System.currentTimeMillis();
System.out.println("\n"+ "Elapsed time: " + (end-start));
}

}