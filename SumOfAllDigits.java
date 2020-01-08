import java.util.Scanner;

public class SumOfAllDigits {
	public static int sum(int a) {
		int rem = 0;
		while(a!=0) {
			rem = rem + a%10;
			a = a/10;
		}
		return rem;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = s.nextInt();
		
		System.out.println("Sol is "+ sum(a));

	}

}
