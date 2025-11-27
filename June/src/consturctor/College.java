package consturctor;

class College 
{
	String c_name;
	String u_name;
	int e_cost;
	College(String c_name,String u_name,int e_cost)
	{
		this.c_name=c_name;
		this.u_name=u_name;
		this.e_cost=e_cost;
	}
	public static void main(String[] args) 
	{
		College c1 = new College("BCA","Periyar university",2000);
		College c2 = new College("B.Tech(CS)","IIT Delhi",1800);
		System.out.println(c1.c_name+" "+c1.u_name+" "+c1.e_cost);
		System.out.println(c2.c_name+" "+c2.u_name+" "+c2.e_cost);
	}
}
