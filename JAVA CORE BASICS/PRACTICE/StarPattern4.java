package JavaPracs;

public class StarPattern4 {
 public static void main(String[] args) {
	 int i,j,k;
		for(i=1;i<=5;i++)// For Rows
		{
			for(j=1;j<=i;j++) // For Space			
		    {
				System.out.print(" ");
			}
			for(k=i; k<=5; k++)// For Column
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
	  
}
}
