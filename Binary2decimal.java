import java.util.*;
public class Program
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int bnum = s.nextInt();
		int rem,base=1;
		int sum=0;
		int num = bnum;
		while(num>0)
		{
		    rem = num%10;
		    sum = sum + rem * base;
		    num = num/10;
		    base*=2;
		}
		System.out.print(sum);
	}
}
