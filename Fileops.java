import java.io.*;

public class Fileops
{

public static void main(String[] args)

{
long start,end;
start = System.currentTimeMillis();
int i,k,j,limit=50,sum;
char S;


/* Reading from File*/

FileInputStream fin=null;

try{
fin = new FileInputStream("G:/java/Amit2.txt");
} catch(FileNotFoundException e) {
	System.out.println("File opening error");
	}


try{
	do{
		S= (char)fin.read();
		System.out.print(S);
	}while((int)S!=-1);
} catch(IOException e){
	System.out.println("File reading error");
	}

try{
fin.close();
} catch(IOException e){
	System.out.println("File closing error");
	}


}
}
