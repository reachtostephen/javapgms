public class pgm{
	public static boolean isPrime(int n) {
		for(int i=2;i<n-1;i++) {
			if(n%i==0)
				return false;
			}
		return true;
		}
	public static void main(String [] args) {
		if(isPrime(10)) {
			System.out.print("The Number is Prime");
		}
		else
			System.out.print("The Number is not prime");
	}
}
