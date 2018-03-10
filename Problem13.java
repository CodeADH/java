import java.io.*;

public class Problem13
{

public static void main(String[] args)

{
long start,end;
start = System.currentTimeMillis();
int i,k,j,limit,rows,cols,sum;
int digmatrix[][] = new int[100][50]; // to store data read from file
int resmatrix[][] = new int[2][50]; //for carryovers and sum digits
int resmatrix_spl=0;
int asciiref[] ={48,49,50,51,52,53,54,55,56,57};
int decref[] ={0,1,2,3,4,5,6,7,8,9};
int f,d=12;

//Initializing the result array
for(i=0;i<2;i++){
for(j=0;j<50;j++){
resmatrix[i][j]=0;
}
}

/* Opening File*/

FileInputStream fin=null;

try{
fin = new FileInputStream("G:/java/Data.txt");
} catch(FileNotFoundException e) {
	System.out.println("File opening error");
	}

/* Reading from File and populating array*/
i=0;j=0;

try{
	for(i=0;i<100;i++)
	{
	for(j=0;j<50;j++)
	{
		digmatrix[i][j]= fin.read();
		if(digmatrix[i][j]==13) digmatrix[i][j]= fin.read();//Read next char if end or start of line which are 13 or 10
		if(digmatrix[i][j]==10) digmatrix[i][j]= fin.read();//Read next char if end or start of line which are 13 or 10
		if(digmatrix[i][j]==-1) break;//-1 means end of file
			for(f=0;f<=9;f++)
			{
//			System.out.println("digmatrix[i][j] "+ digmatrix[i][j]+" ");
//			System.out.println("asciiref[f] "+asciiref[f]+" ");
				if(digmatrix[i][j] == asciiref[f]) 
				{
				digmatrix[i][j]=decref[f];
//			System.out.println("digmatrix[i][j] "+ digmatrix[i][j]+" ");
//			System.out.println("decref[f] "+decref[f]+" ");

				break;
				}
			}
//		if(digmatrix[i][j]==13 | digmatrix[i][j]==10)System.out.println("i,j,char are :"+i+" "+j+" "+digmatrix[i][j]);
	}
//	if(digmatrix[i][j]==-1) break;
	} 

}catch(IOException e){
	System.out.println("File reading error");
	}

//Closing the file
try{
fin.close();
} catch(IOException e){
	System.out.println("File closing error");
	}
/*original trial with smaller dim array

int [][] digmatrix = {{7,6,4,5,8},
	       {3,0,6,7,7},
	       {2,1,8,9,9},
	       {4,7,5,6,3},
	       {9,8,6,2,0}};

*/
/* Debug code to display array
	for(i=0;i<100;i++){
	for(j=0;j<50;j++){
		System.out.print(digmatrix[i][j]+ " ");
	}
System.out.println("\n");
}*/
//limit looping to understand concept
for(limit=d;limit>1;limit--)
{

//Actual logic of sum starts
for(j=limit-1;j>=0;j--)
{
sum=0;
for(i=0;i<100;i++)
{
sum=sum+digmatrix[i][j];
}
//System.out.println(sum);
if(j==limit-1) 
{
resmatrix[0][j]= 0;
resmatrix[1][j]= sum%10;
resmatrix[0][j-1]= sum/10;
}

if((j<limit-1) & j!=0) 
{
resmatrix[1][j]= (resmatrix[0][j]+sum)%10;
resmatrix[0][j-1]= (resmatrix[0][j]+sum)/10;
}

if(j==0) 
{
resmatrix[1][j]= (resmatrix[0][j]+sum)%10;
resmatrix_spl= (resmatrix[0][j]+sum)/10;
}

}

System.out.print("\n considering "+limit+" columns carryovers are:");
for(i=0;i<1;i++){
for(j=0;j<limit;j++){
System.out.print(resmatrix[i][j]+ " ");
}
//System.out.println("\n");
}

//printing leading digits and X digits
System.out.print(" & leading digits are: "+resmatrix_spl);
for(i=1;i<2;i++){
for(j=0;j<limit;j++){
System.out.print(resmatrix[i][j]);
}
}

} // limit loop ends here
end = System.currentTimeMillis();
//System.out.println("Elapsed time in Minutes: " + ((end-start)/1000/60));
System.out.println("\n Elapsed time in Msec: " + (end-start));


}
}

