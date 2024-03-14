package JavaPracs;

public class StarPattern6 {
       public static void main(String[] args) {
    	   int i,j;
   		for(i=1;i<=5;i++)//Rows
   		{
   			for(j=1;j<=5;j++)//columns
   			{   
   				if(i==1 || i==5 || j==1 || j==5) 
   				{
   					System.out.print("*");
   				}
   				else
   				{
   					System.out.print(" ");
   				}
   				
   			}
   			System.out.println();
   		}
	}
}
