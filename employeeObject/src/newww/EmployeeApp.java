package newww;

public class EmployeeApp {
public static void main(String []args) {
	Employee e1 = new Employee();
	e1.setDate("shashank", 100, 3500);
	System.out.println(e1.getname());
	System.out.println(e1.getid());
	System.out.println(e1.getsalary());
}
}
