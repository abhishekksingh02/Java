package core_Java;

class square
{  int side;
   float area;
   float perimeter;
   
     public int area() 
     {
    	 return side*side;
     }
     public int perimeter() 
     {
    	 return 4*side;
     }
     
}  
 class upd_rectangle
 
 {
	 int a;
	 int b;
	    int area()
	   {
		   return a * b;
	   }
	   int perimeter()
	   {
		   return 2 * ( a * b);
	   }
 }
	



public class ClassndObjPrac {
    public static void main(String[] args) {
		square sq = new square();
		sq.side = 5;
		System.out.println("Area of Square with side 5 is: "+ sq.area());
		System.out.println("perimeter of Square with side 5 is: "+ sq.perimeter());
		
		System.out.println("\n");
		
		upd_rectangle rq =  new upd_rectangle();
		rq.a = 7;
		rq.b = 5;
		System.out.println("Area of rectangle with length 7 and breadth 5 is: " + rq.area());
		System.out.println("Perimeter of rectangle with length 7 and breadth 5 is: " + rq.perimeter());
	}
}
