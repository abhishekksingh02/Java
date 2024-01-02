package core_Java;

class Sender
{
	public void send(String msg)
	{  System.out.println("Sending...." + msg );
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println( msg + " sent!!!!" );
	}
}

class ThreadSend extends Thread
{
	Sender sender;
	String msg;
	
	public ThreadSend(Sender sender , String msg)
	{
		this.sender =  sender;
		this.msg  = msg;
	}
	 public void run()
	 {
		 super.run();
		 
		 synchronized(sender)
		 {
			 sender.send(msg);
		 }
	 }
}
public class ThreadEx4 {
   public static void main(String[] args) {
	
	   Sender sender = new Sender();
	   
	   ThreadSend t1 = new ThreadSend(sender, "HI");
	   ThreadSend t2 = new ThreadSend(sender, "ADIOS!!!!");
	   
	   t1.start();
	   t2.start();
}
}
