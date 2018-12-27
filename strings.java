import java.util.Scanner;
//import java.util.*;

/*
public class cls {
public static void main(String args[])
{
	int a = 10;
	if(a>0)
	{
		System.out.println("Hello World since greater than 0");
	}
}
}
*/


//Sum of two numbers	
/*public class cls{
	public static void main(String args[])
	{
		int a;
		int b;
		int c;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = a + b;
		System.out.println("The Addition is " + c);
		scanner.close();
	}
}
*/
/*
//Swapping of two numbers
public class cls{
	public static void main(String args[])
	{
		int a;
		int b;
		int c = 0;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);
		s.close();
	}
}
*/

// Reverse a number
/*public class cls{
	public static void main(String args[])
	{
		int n = 0,rev = 0;
		Scanner s = new Scanner(System.in);
		int no = s.nextInt();
		while(no>0)
		{
			n = no % 10;
			rev = rev * 10 + n;
			no = no / 10;
			}
		System.out.println("The Reverse of the given Number is " + rev);
		s.close();
	}
}
*/


//Short Arithmetic
/*public class cls{
	public static void main(String args[])
	{
		int j = 5, i = 6;
		i+=5;
		j+=6;
		System.out.println(j);
		System.out.println(i);
	}
}
*/



//Armstrong Number
/*
public class cls{
	public static void main(String args[])
	{
		int temp;
		int n;
		int sum = 0;
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		temp = num;
		while(num > 0) 
			{
			n =num % 10;
			sum = sum + n * n * n;
			num = num/10;
			}
		if(sum == temp)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("not an Armstrong number");
		}
	  s.close();
	}
}
*/


//Factorial of a number
/*
public class cls{
	public static void main(String ars[])
	{
		int sum = 0;
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for(int i = 1;i <= num; i++)
		{
			sum = sum + i;
		}
		System.out.println(sum);
		s.close();
	}
}
*/


//Fibonacci series
/*
 public class cls{
	 public static void main(String args[])
	 {
	 Scanner s = new Scanner(System.in);
	 int Limit = s.nextInt();
	 int a = 0;
	 int b = 1;
	 int c = 1;
	 System.out.print(a + " ");
	 System.out.print(b+ " ");
	 while(c < Limit)
	 {
		 System.out.print(c+ " ");
		 c = a+b;
		 a = b;
		 b = c;
	 }
	 s.close();
	 }
 }
 */


//String charAt
/*import java.util.Scanner;

public class cls {
public static void main(String args[])
{
	String s = "This is Java";
	int i;
	for(i = 0;i < s.length(); i++)
	{
		System.out.println("The Char at position " + i + "is " +s.charAt(i) );
	}
	
}
}
*/


//String compareto
/*
public class cls{
	public static void main(String args[])
	{
		String s1 = "Hii";
		String s2 = "Hello";
		String s3 = "hello";
		System.out.println("Comparison Between S1 and S2 is " + s1.compareTo(s2));
		System.out.println("Comparison Between S2 and S3 is "+ s2.compareTo(s3));
		}
}
*/


//String concat
/*
public class cls{
	public static void main(String args[])
	{
		String s1 = Hello";
		String s2 = "World";
		System.out.println(s1.concat(s2));
	}
}
*/


//String contains
/*
public class cls{
	public static void main(String args[])
	{
		String s1 = "How You doing";
		System.out.println(s1.contains("You"));//returns Boolean type
	}
}
*/


//String Endswith

/*public class cls{
	public static void main(String args[])
	{
		String s1 = "Welcome to Java";
		System.out.println(s1.endsWith("Java"));//Returns Boolean type 
	}
}
*/

//String Equals //can also compare objects
/*
public class cls{
	public static void main(String args[])
	{
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println(s1.equals(s2));//Returns Boolean type
	}
}
*/



//String Equals IgnoreCase
/*
public class cls{
	public static void main(String args[])
	{
		String s1 = "Hii";
		String s2 = "Hello";
		String s3 = "hello";
		System.out.println("Comparison Between S1 and S2 is " + s1.equalsIgnoreCase(s2));
		System.out.println("Comparison Between S2 and S3 is "+ s2.equalsIgnoreCase(s3));
		
	}
}
*/


//String format
/*
public class cls{
	public static void main(String args[])
	{
		String s1 = "java";
		double n = 123.12423634634758458;
		System.out.println(String.format("%s",s1));
		System.out.println(String.format("%123.3f",n));
	}
}
*/


//Sorting
//input : 4 5 1 7 2 3
//output : 1 2 3 4 5 7
/*
public class cls
{
	public static void bubble(int[] arr)
	{
		int temp = 0;
		for(int i = 0;i < arr.length-1;i++)
		{
			for(int j = i+1; j< arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	   
	}
	public static void main(String args[])
	{
		int [] arr = {3 ,60 ,35, 2, 45, 320, 5 };
		System.out.println("Before Sorting");
		for (int i = 0;i < arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		bubble(arr);
		System.out.println("After Sorting");
		for (int i = 0;i < arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		
	}
}
}
*/


/*
//Java enum
class Juice
{
	enum freshjuice{small,medium,large};
	freshjuice size;
}

class cls
{
	public static void main(String args[])
	{
		Juice j = new Juice();
		j.size = Juice.freshjuice.medium;
		System.out.println("" + j.size);
	
	}
}
*/
/*
public class cls{
	static int number;
	protected static int add()
	{
		number++;
		return number;
	}
	cls()
	{
		add();
	}
	public static void tot()
	{
		System.out.println(number);
	}
public static void main(String args[])
{
	for(int i=0;i<500;i++)
	{
		new cls();
	}
	cls.tot();
	
}
}
*/

/*
class cls{
	public static void main(String args[])
	{
		Scanner S = new Scanner(System.in);
		int num = S.nextInt();
		String num1 = Integer.toString(num);
		if(num1.endsWith("1") || num1.endsWith("3") ||num1.endsWith("5") ||num1.endsWith("7")|| num1.endsWith("9"))
				{
					System.out.println("ODD");
				}
		else
		{
			System.out.println("Even");
		}
		
		
		S.close();
		
	}
}
*/









