package JavaPracs;

public class StarPattern1 {
  public static void main(String[] args) {
	int i,j;
	for(i=1;i<=5;i++)// For Rows
	{
		for(j=1;j<=i;j++) // For Columns
		{
			System.out.print(" * ");
		}
		System.out.println();
	}
}
}
