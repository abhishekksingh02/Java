package core_Java;

public class ArithmeticEx {
   public static void main(String[] args) {
	  
	   try
	   {
		   int data = 10/0;
		   System.out.println(data);
	   }
	   catch(Exception error)
	   {
		   System.out.println(error);
	   }
	   System.out.println("Success");
    }
}
