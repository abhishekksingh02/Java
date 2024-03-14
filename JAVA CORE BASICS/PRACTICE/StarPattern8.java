package JavaPracs;

public class StarPattern8 {
   public static void main(String[] args) {
	
	   int i,j,k;
	     
	     for(i=1;i<=5;i++)
	     {
	    	 for(j=5;j>i;j--)
	    	 {
	    		 System.out.print(" "); // for space
	    	 }
	    	 for(k=1;k<=2*i-1;k++)
	    	 {
	    		 System.out.print("*");
	    	 }
	    	 System.out.println();
	     }
}
}
