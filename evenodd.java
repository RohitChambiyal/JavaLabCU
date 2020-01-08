import java.util.Scanner;

public class evenodd {
	public static void check(int a) {
		if(a%2==0) 
			System.out.println("even");
		else
			System.out.println("odd");
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check");

		int a= s.nextInt();
		check(a);
	}
}
