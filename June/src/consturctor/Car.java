package consturctor;

class Car 
{
	double c_cost;
	String c_name;
	String c_type;
	Car(double c_cost,String c_name,String c_type)
	{
		this.c_cost=c_cost;
		this.c_name=c_name;
		this.c_type=c_type;
	}
	public static void main(String[] args) 
	{
		Car c1 = new Car(800000,"Maruto Suzuki","Petrol");
		Car c2 = new Car(500000,"Hyundai","Disel");
		System.out.println(c1.c_cost +" "+c1.c_name+" "+c1.c_type);
		System.out.println(c2.c_cost +" "+c2.c_name+" "+c2.c_type);
	}
}
