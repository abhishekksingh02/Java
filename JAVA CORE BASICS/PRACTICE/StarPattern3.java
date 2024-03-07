package JavaPracs;

public class StarPattern3 {
  public static void main(String[] args) {
	  int i,j,k;
		for(i=1;i<=5;i++)// For Rows
		{
			for(j=i;j<=5;j++) // For Space			
		    {
				System.out.print(" ");
			}
			for(k=1; k<=i; k++)// For Column
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
	  
    }
}
