package core_Java;

public class ArrayEx1 {
	 
	public static void main(String[] args) {
		
		int a[] = new int[5];// 1st way of Array initialization in Java.
		
//		int a1[] = {1,2,3,4,5};// 2nd way of Array initialization in Java.
		
		// 3rd way of Array initialization in Java
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
 
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}

}
