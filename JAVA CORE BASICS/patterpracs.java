package core_Java;

public class patterpracs {
	public static void main(String[] args) {
		int n = 5;
		//int counter = 1;
		//Pattern example:01
		
	//for(int i=1;i<=n;i++) {
		///for(int j=1;j<=i;j++) {
			//System.out.print(j + " ");
		//}
		//System.out.println();
		
		//Pattern example:02
		
		//for(int i=1;i<=n;i++) {
			//for(int j=1;j<=i;j++) {
				//System.out.print(j + " ");
			//}
			//System.out.println();
		//}
		//for(int i=n-1;i>=1;i--) {
			//for(int j=1;j<=i;j++) {
			//	System.out.print(j+ " ");
		//	}
			//System.out.println();
		
		// Pattern example: 03
		
		//for(int i=n;i>=1;i--) {
			//for(int j=i;j>=1;j--) {
				//System.out.print(j + " ");
			//}
			//System.out.println();
		
		// Pattern example: 04
		
		//for(int i=1;i<=n;i++) {
		//	for(int j=1;j<=i;j++) {
		//		System.out.print(counter + " ");
		//		counter++;
		//	}
		//	System.out.println();
		
		// Pattern example: 05
		
		//for(int i=1;i<=n;i++) {
			//for(int j=1;j<=i;j++) {
				//System.out.println(j+ " ");
			//}
			
			//for(int j=i-1;j>=1;j--) {
		//		System.out.print(j+ " ");
		//	}
			//System.out.println();
		
		 for(int i=1;i<n;i--) {
			 for(int j=1;j<=i;j--) {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }
		}
	}



