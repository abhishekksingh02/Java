package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Email em1 = new Email("Abhishek", "Singh");
        
//        em1.setAlternateEmail("as@gmail.com");
//        System.out.println((em1).getAlternateEmail());
        System.out.println(em1.showInfo());
	}

}
