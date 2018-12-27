import java.util.Scanner;
public class pgm{
	public static void floyd(int n) {
		int count=1;
		int j=1;
		while(count<=n) {
			for(int i=1;i<=count;i++) {
				System.out.print(j+" ");
				j++;
			}
			count++;
			System.out.println();
		}
	}
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = s.nextInt();
		floyd(n);
		s.close();
	}
}
