import java.io.*;
import java.util.*;

class pal
{
	int number(int n)
	{
		int t,d,s=0;
		t=n;
		while(t>0)
		{
			d=t%10;
			s=s*10+d;
			t=t/10;
		}
		return s;
	}
}

class Abcd
{
	public static void main(String[] s)
	{
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer");
		x=sc.nextInt();
		pal obj = new pal();
		y = obj.number(x);
		System.out.println("Palindrome"+y);
	}
}
