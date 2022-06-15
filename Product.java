class Product
{
	int id;
	String name;
	//creating a parameterized constructor
	Product(int i,String n)
	{
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String args[])
	{
		Product s1=new Product(111,"Anusa");
		Product s2=new Product(222,"Aleena");
		s1.display();
		s2.display(); 
	}
}
