import java.util.Arrays;
public class max2min2
{
	public static void main(String[] args) {
    int arr[] = {5,1,23,54,33,22,-11,32};
    Arrays.sort(arr);
    int n=arr.length;
    System.out.println("Maximum value "+ arr[n-1]);
    System.out.println("2nd Maximum value "+ arr[n-2]);
    
    System.out.println("Minimum value "+ arr[0]);
    System.out.println("2nd Maximum value "+ arr[1]);
	}
}
