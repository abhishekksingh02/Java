package core_Java;

class C implements Runnable
{
	 public void run()
	 {
		 for(int i=1;i<=10;i++)
		 {
			 System.out.println("Thread C: "+i);
		 }
	 }
}
class D implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.err.println("Thread D is: "+i);
		}
	}
}
public class ThreadEx3 {
    public static void main(String[] args) {
		
    	Thread t1 = new Thread(new C());
    	Thread t2 = new Thread(new D());
    	t1.start();
    	t2.start();
	}
}
