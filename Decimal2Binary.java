import java.util.Scanner;
public class Program
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int num = s.nextInt();
	    String str = " ";
	    while(num>0)
	    {
	        int n = num%2;
	        str+= n;
	        num = num/2;
	    }
		System.out.println(str);
	}
}
