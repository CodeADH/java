
//Logic only works for numbers upto 255

public class ManualBinaryConv
{
 
    public static void main(String[] args) 
	{

	int i,j,N=255;
	int Div[] = new int[8];
	int	Rem = N;
//System.out.println(N + "is same as " + Rem); 
//System.out.println(Math.pow(2,7));
		for(i=7;i>=0;i--)
		{
			Div[i] = Rem/((int) Math.pow(2,i));
//			System.out.println(Div[i]); 
			Rem = Rem%((int) Math.pow(2,i));
		}
			System.out.print("Binary value of " + N + " as per my logic is :");
			for(j=7;j>=0;j--)
			{
			System.out.print(Div[j]); 
			}
		System.out.println();
		System.out.println("Binary value of " + N + " as per inbuilt method is " + Integer.toString(N,2));
	}
}

/*N=2^7*j+2^6*k+2^5*l+2^4*m+2^3*n+2^2*o+2^1*p+2^0*q
200=128*1+64*1*+32*0+16*0+8*1+4*0+2*0+1*0
	72		8	8	   8	0    0   0   0 	*/

//N = (int) System.in.read();


