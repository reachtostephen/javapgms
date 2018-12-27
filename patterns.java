import java.util.*;
public class Program
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int k = 2*n-2;
	    for(int i=0;i<n;i++)
	    {
	       for(int m = 0;m<k;m++)
	       {
	           System.out.print(" ");
	       }
	       k=k-1;
	       for(int j=0;j<=i;j++)
	       {
	           System.out.print("* ");
	       }
	       System.out.println();
	    }
	}
}
