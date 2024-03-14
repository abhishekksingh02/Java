package JavaPracs;

public class Characterpattern3 {
  public static void main(String[] args) {
	char i,j,count='A';
	for(i='A';i<='Z';i++)
	{      
//		count = 'A'; // Reset count for each row 
	
		for(j='A';j<=i;j++)
		{   
			
			System.out.print(count + " ");
			count++; // increment count after each character is printed
			
		}
		System.out.println();
	}
}
}
