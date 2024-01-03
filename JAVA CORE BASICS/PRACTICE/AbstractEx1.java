package core_Java;


abstract class F
{
	void a() {
		System.out.println("a");
	}
	abstract void b();  // Abstract class can access any type of method whether it is abstract or the normal one
}
 class E extends F
 {
	 void b()
	 {
		 System.out.println("b");
	 }
 }
abstract class AbstractEx1 {
	  public static void main(String[] args) {
		E e = new E();
		e.a();
		e.b();
	}
}
     
