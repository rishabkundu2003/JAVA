import java.io.*;
import java.util.*;

class Program
{
	int Search1(int a[], int k)
	{
		int i,lc=0;
		for(i=0; i<a.length; i++)
		{
			if(a[i]==k)
			{
				lc=i+1;
			}
		}
		return lc;
	}
	

	int Search2(int a[], int k)
	{
		int l=0, r=a.length-1,m,b=0;
		while(l<=r)
		{
			
			b++;
			m=(l+r)/2;
			if(a[m]==k)
			{
				return m;
			}
			else if(a[m]<k)
			{
				l=m+1;
			}
			else
			{
				r=m-1;
			}
		}
		return b;
	}
}

class SearchP
{
	public static void main(String[] s)
	{
		Scanner sc = new Scanner(System.in);
		int a[]={20,40,10,35,78,29,34,56};
		System.out.print("Enter an element");
		int k = sc.nextInt();
		Program obj = new Program();
		int x = obj.Search1(a,k);
		if(x!=-1)
		{
			System.out.println("Found"+ x);
		}
		else
		{
			System.out.println("Not found");
		}
		int y = obj.Search2(a,k);
		if(y!=-1)
		{
			System.out.println("Found"+ y);
		}
		else
		{
			System.out.println("Not found");
		}
	}
}
