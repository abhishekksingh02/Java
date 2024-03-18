package JavaPracs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8EmpDemo {
   public static void main(String[] args) {
	
	   List<Employee> empList = new ArrayList<Employee>();
	   
	    empList.add(new Employee(1, 500));
	    empList.add(new Employee(2, 1500));
	    empList.add(new Employee(3, 2500));
	    empList.add(new Employee(4, 3500));
	    empList.add(new Employee(5, 4500));
	    empList.add(new Employee(6, 5500));
	    empList.add(new Employee(7, 6500));
	    
	  List<Employee> empSortedList =   empList.stream().sorted((o1 , o2) -> (int)(o2.getSalary()-o1.getSalary())).limit(3).collect(Collectors.toList());// Sorting employees in ascending order on the basis of their salaries
	    
	    System.out.println(empSortedList);
	   }
}
