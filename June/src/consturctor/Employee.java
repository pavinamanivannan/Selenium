package consturctor;

class Employee
{
	String e_name;
	int e_id;
	double e_sal;
	Employee(String e_name,int e_id,double e_sal)
	{
		this.e_name=e_name;
		this.e_id=e_id;
		this.e_sal=e_sal;
	}
	public static void main(String[]args)
	{
		Employee e1 = new Employee("Pavina",111,70000.08);
		Employee e2 = new Employee("Ruthra",112,30000.18);
		System.out.println(e1.e_name+"\n"+e1.e_id+"\n"+e1.e_sal);
		System.out.println(e2.e_name+"\n"+e2.e_id+"\n"+e2.e_sal);
	}
}