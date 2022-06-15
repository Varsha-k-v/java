import java.util.Scanner;
class Linear
{
	public static void main(String args[])
	{
		int i, n, search, arr[];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of elements");
		n = in.nextInt();
		arr = new int[n];
		System.out.println("Enter those " + n + " elements");
		for (i = 0; i < n; i++)
		arr[c] = in.nextInt();
		System.out.println("Enter value to find");
		search = in.nextInt();
		for (i = 0; i < n; i++)
		{
		if (arr[i] == search)
			{
				System.out.println(search + " is present at location " + (i + 1) + ".");
				break;
			}
		}
		if (i == n)
		System.out.println(search + " isn't present in array.");
	}
}
