package consturctor;

class Mobile
{
	int m_cost;
	String m_name;
	String m_color;
	Mobile(int m_cost,String m_name,String m_color)
	{
		this.m_cost=m_cost;
		this.m_name = m_name;
		this.m_color = m_color;
	}
	public static void main(String[]args)
	{
		Mobile m1=new Mobile(15000,"Gallaxy A15","Black");
		Mobile m2=new Mobile(50000,"Redmi note 13","Blue");
		System.out.println(m1.m_cost +" "+m1.m_name+" "+m1.m_color);
		System.out.println(m2.m_cost +" "+m2.m_name+" "+m2.m_color);
	}
}