class Product1
{
	String pcode;
	String pname;
	int price;
	void insert(int p,String pc,String pn)
	{
		pcode=pc;
		pname=pn;
		price=p;
	}
	void display()
	{
		System.out.println(pcode+" "+pname+" "+price);
	}
}
class Pro
{
	public static void main(String args[])
	{
		int s;
		Product1 p1=new Product1();
		Product1 p2=new Product1();
		Product1 p3=new Product1();
		p1.insert(1000,"A100","Pen");
		p2.insert(1200,"A200","Pencil");
		p3.insert(1300,"A100","Eraser");
		p1.display();
		p2.display();
		p3.display();
		if(p1.price<p2.price)
		{
			if(p3.price<p1.price)
			{
				s=p3.price;
			}
			else
			{
				s=p1.price;
			}
		}
		else
                {
                        if(p2.price<p3.price)
                        {
                                s=p3.price;
                        }
                        else
                        {
                                s=p3.price;
                        }
                }
		System.out.println(s+" is the smallest price");

	
		
	}
}
