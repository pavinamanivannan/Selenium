package consturctor.Constuctor;

class Employee
{
	String emp_name;
	int emp_id;
	double emp_sal;
	Employee(String s, int a, double b)
	{
		emp_name=s;
		emp_id=a;
		emp_sal=b;
	}
	public static void main(String[]args)
	{
		Employee e1 = new Employee("Pavina",3401,40000);
		Employee e2 = new Employee("Sathiya",4012,90000);
		System.out.println(e1.emp_name+" "+e1.emp_id+" "+e1.emp_sal);
		System.out.println(e2.emp_name+" "+e2.emp_id+" "+e2.emp_sal);
	}
}