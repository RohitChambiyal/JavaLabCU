import java.util.Scanner;

public class Fact {
	public static void check(int a) {
		int factorial = 1;
		while(a>0) {
			factorial *=a;
			a--;
		}
		System.out.println("Factorial is "+ factorial );
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to find factorial");
		int a = s.nextInt();
		check(a);
	}

}
