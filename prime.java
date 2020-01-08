import java.util.Scanner;

public class prime {
	public static int check(int a) {
		for(int i=2;i<a/2;i++) {
			if(a%i==0) {
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check");
		int a = s.nextInt();
		if(check(a)==1) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");

		}

	}

}
