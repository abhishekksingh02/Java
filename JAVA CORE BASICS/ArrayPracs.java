package core_Java;

public class ArrayPracs {
  public static void main(String[] args) {
	// Problem 01:
//	float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//	float sum = 0;
//	 for(float element:marks) {
//		 sum = sum + element;
//	 }
//	 System.out.println("The value of sum is: "+ sum);
//	 
//	 System.out.println("Problem second:");
//	  Problem 02:
//	 int[] marks1 = {23,45,56,78,89};
//	 int num = 45;
//	 boolean isInArray = false;
//	 for(int element:marks1) {
//		 if(num==element) {
//			 isInArray = true;
//			 break;
//		 }
//	 }
//	 if(isInArray) {
//		 System.out.println("The value is present in the Array.");
//	 }
//	 else {
//		 System.out.println("The value is not present in the Array.");
//	 }
//	 
	 // Problem 03;
//	 System.out.println("Problem third.");
//	 float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//		float sum = 0;
//		 for(float element:marks) {
//			 sum = sum + element;
//		 }
//		 System.out.println("The value of average marks is: "+ sum/marks.length);
	  
	  // Problem 04:
//	  System.out.println("Problem fourth.");
//	  int [][] mat1 = {{1,2,3},
//			          {4,5,6}};
//	  int [][] mat2 = {{2,6,13},
//			           {4,7,1}};
//	  int [][] result = {{0,0,0},
//	                    {0,0,0}};
//	  
//	  for(int i = 0; i<mat1.length;i++) { // row number of times
//		  for(int j = 0; j<mat1[i].length ; j++) {
//			  System.out.println("Setting value for i");
//			  result[i][j] = mat1[i][j] + mat2[i][j];
//		  }
//	  }
	  // Problem 05;
//	  System.out.println("Problem 5, to reverse an Array.");
//	  int [] arr = {1, 2, 3, 4, 5, 6};
//	  int l = arr.length;
//	  int n =  Math.floorDiv(l, 2);
//	  int temp;
//	   for(int i=0; i<n; i++) {
//		   temp = arr[i];
//		   arr[i] = arr[l-i-1];
//		   arr[l-i-1] = temp;
//		   }
//	   for(int element: arr) {
//		   System.out.print(element + " ");
//	   }
	  
	  // Problem 06:
	  
//	  System.out.println("Problem 6, to find the maximum didgit in the array.");
//	  int [] arr = {1, 21, 3, 455, 34, 67};
//	  int max = 0;
//	  for(int element: arr) {
//		  if(element>max ) {
//			  max = element;
//		  }
//	  }
//	  System.out.println("The maximum value in the array is: "+ max);
	  
	  // Problem 07:
	  int [] arr = {1, 2100, 4, 455, 5, 34};
	  boolean isSorted = true;
	  for(int i=0 ; i<arr.length-1; i++) {
		  if(arr[i]> arr[i+1]) {
			  isSorted = false;
			  break;
		  }
	  }
	  if(isSorted) {
		  System.out.println("The array is sorted.");
	  }
	  else {
		  System.out.println("The array is not sorted.");
	  }
	   
	  }
}
  

