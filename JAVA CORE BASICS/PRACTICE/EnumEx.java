package core_Java;

enum student
{
	Abhishek(21),Ketan(23),Nikhil(45),Sam(21);
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	student(int age)
	{
		this.age = age;
	}
	
}

public class EnumEx {
   public static void main(String[] args) {
	 System.out.println("Age of Abhishek is " + student.Abhishek.getAge() + " years.");
	 System.out.println("Age of Ketan is " + student.Ketan.getAge() + " years.");
	 System.out.println("Age of Nikhil is " + student.Nikhil.getAge() + " years.");
	 System.out.println("Age of Sam is " + student.Sam.getAge() + " years.");

}
}
