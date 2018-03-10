public class BinaryConv {
 
    public static void main(String[] args) {
	int a = 200; // Binary equivalent is 10000000
	System.out.println("Binary value of " + a + " is " + Integer.toString(a,2));
	byte b = (byte) (a << 2);//left shift by 2
	System.out.println("Binary value of " + b + " is " + Integer.toString(b,2));

    }
}