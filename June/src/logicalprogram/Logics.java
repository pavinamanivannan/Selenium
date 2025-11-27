package logicalprogram;

public class Logics {
	public static void swapTwo(int a, int b)
	{
		System.out.println("Before swappping value of a= "+a);
		System.out.println("Before swappping value of a= "+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("After swappping value of a= "+a);
		System.out.println("After swappping value of a= "+b);
	}
	
	public static void withoutSwap(int a,int b)
	{
		a =a+b;
		b = a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void fetchlastNo(int n)
	{
		int res = n%10;
		System.out.println(res);
	}
	
	public static void deleteLastno(int n)
	{
		n=n/10;
		System.out.println(n);
	}
	
	public static void ifEven(int n)
	{
		if (n%2==0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
	}
	
	public static void ifOdd(int n)
	{
		if (n%2!=0)
			System.out.println("Odd number");
		else
			System.out.println("Even number");
			
	}
	
	public static void for1ton(int n)
	{
		for (int i = 0; i <= n; i++) 
		{
			System.out.println(i);
		}
	}
	
	public static void sumOf1ton(int n)
	{
		int sum = 0;
		for (int i = 0; i <= n; i++) 
		{
			sum = sum+i;
		}
		System.out.println(sum);
	}
	
	public static void factOf1ton(int n)
	{
		int fact = 1;
		for (int i = 1; i <= n; i++) 
		{
			fact = fact*i;
		}
		System.out.println(fact);
	}
	
	public static void forOdd(int n)
	{
		for (int i = 1; i <=n; i++) 
		{
			if (i%2!=0)
			{
				System.out.println(i);
			}
		}
		
	}
	
	public static void forEven(int n)
	{
		for (int i = 1; i <=n; i++) 
		{
			if (i%2==0)
			{
				System.out.println(i);
			}
		}
		
	}
	
	public static void forsumOdd(int n)
	{
		int sum = 0;
		for (int i = 1; i <=n; i++) 
		{
			if (i%2!=0)
			{
				sum = sum+i;
			}
		}
		System.out.println(sum);
	}
	
	public static void forsumEven(int n)
	{
		int sum = 0;
		for (int i = 1; i <=n; i++) 
		{
			if (i%2==0)
			{
				sum = sum+i;
			}
		}
		System.out.println(sum);
	}
	
	public static void forfactOdd(int n)
	{
		int fact = 1;
		for (int i = 1; i <=n; i++) 
		{
			if (i%2!=0)
			{
				fact = fact+i;
			}
		}
		System.out.println(fact);
	}
	
	
	public static void forfactEven(int n)
	{
		int fact = 1;
		for (int i = 1; i <=n; i++) 
		{
			if (i%2==0)
			{
				fact = fact+i;
			}
		}
		System.out.println(fact);
	}
	
	public static void forTables(int n)
	{
		for (int i = 1; i <=10; i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}
	
	public static void forStar()
	{
		for (int i = 0; i<=5; i++) 
		{
			System.out.print("*");
		}
	}
	
	public static void patterns()
	{
		for (int i = 1; i <=5; i++) 
		{
			for (int j = 1; j <=5; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void patternsno()
	{
		for (int i = 1; i <=5; i++) 
		{
			for (int j = 1; j <=5; j++) 
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void patternsameno()
	{
		for (int i = 1; i <=5; i++) 
		{
			for (int j = 1; j <=5; j++) 
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	public static void pattern1to25()
	{
		int count=1;
		for (int i = 1; i <=5; i++) 
		{
			for (int j = 1; j <=5; j++) 
			{
				if(count<10)
					System.out.print("0"+count+" ");
				else
					System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
	
	public static void patternAtoY()
	{
		char count='A';
		for (int i = 1; i <=5; i++) 
		{
			for (int j = 1; j <=5; j++) 
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
	
	public static void patternRightangle()
	{
		for (int i = 1; i <=5; i++) 
		{
			for (int j = 1; j <=i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void isPrime(int n)
	{
		int count =0;
		for (int i=1;i<=n;i++)
		{
			if (n%i==0)
			{
				count++;
			}
		}
		if (count==2)
			System.out.println("Prime no");
		else
			System.out.println("Not prime no");
		
	}
	
	
	public static void fibonacci(int fib1, int fib2)
	{
		System.out.print(fib1+" "+fib2);
		for (int i = 1; i <=10; i++) 
		{
			int fib3 = fib1+fib2;
			System.out.print(" "+fib3);
			fib1 = fib2;
			fib2 = fib3;
		}
	}
	public static void bubbleshort()
	{
		int[] ar= {23,63,73,25,84,14};
		for (int i = 0; i < ar.length; i++) 
		{
			for (int j = 0; j < ar.length-1; j++) 
			{
				if (ar[j]>ar[j+1])
				{
					int temp = ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
	public static void main(String[] args) 
	{
		isPrime(72);
		fibonacci(0,1);	
		bubbleshort();
		swapTwo(87,92);
		withoutSwap(83,92);
		fetchlastNo(74);
		deleteLastno(2533);
		ifEven(38);
		ifOdd(2237);
		for1ton(7);
		sumOf1ton(7);
		factOf1ton(5);
		forOdd(7);
		forsumOdd(8);
		forsumEven(6);
		forfactOdd(4);
		forTables(10);
		forStar();
		patterns();
		patternsno();
		patternsameno();
		pattern1to25();
		patternAtoY();
		patternRightangle();
	}
}
