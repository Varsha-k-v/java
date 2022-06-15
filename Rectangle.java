import java.util.*;
class Rectangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("*******Area of Rectangle*******");
		System.out.print("Enter the length of rectangle:-");
		int l=sc.nextInt();
		System.out.print("Enter the breadth of rectangle:-");
                int b=sc.nextInt();
		int area=l*b;
		System.out.println("Area of rectangle with length "+l+" and breadth "+b+" is "+area);
	}
}
