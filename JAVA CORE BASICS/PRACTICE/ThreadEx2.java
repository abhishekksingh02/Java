package core_Java;



public class ThreadEx2 extends Thread {
  // Creating Run method to perform action for thread
  public void run()
  {
	  int a = 10;
	  int b = 20;
	  int result =  a + b;
	  
	  System.out.println("Thread started running...");
	  try 
	  {
		  Thread.sleep(1000);
	  }
	  
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  
	  System.out.println("Sum of two numbers is: " + result);
  }
   
  public static void main(String[] args) {
	
	  // Creating instance of the class extends Thread class
	  ThreadEx2 t2 =  new ThreadEx2();
	  // Calling a start method to execute the run() method of the Thred class
	  t2.start();
}

}
