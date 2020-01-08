import java.util.Scanner;

public class RemoveChar {
	public static void RemString(String a) {
	String x = "";
	boolean s = false;
	int arr[] = new int[123];
	for(int i=0;i<a.length();i++) {
		if(arr[(int)a.charAt(i)]!=0) {
			continue;
		}
		else {
			x= x+a.charAt(i);
			arr[a.charAt(i)]=1;
		}
	}
	System.out.println(x);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String a = s.nextLine();
		RemString(a);

	}

}
