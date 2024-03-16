package JavaPracs;

public class tryCatchEx {
    public static void main(String[] args) {
		
    	System.out.println((divide(10, 2)));
    	System.out.println((divide(10, 0)));
    	
    }

	private static int divide(int numerator, int denominator) {
		// TODO Auto-generated method stub
		
		try
		{
			int result = numerator / denominator;
			return result;
		} catch(ArithmeticException e)
		{
			System.out.println("Exception occured: " + e.getMessage());
			return -1;
		}finally 
		{
			System.out.println("Finally block executed");
		}
//		return null;
	}
}
