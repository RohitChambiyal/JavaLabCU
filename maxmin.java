
public class maxmin
{
	public static void main(String[] args) {
    int arr[] = {5,1,23,54,33,22,-11,32};
    int min=Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min = arr[i];
        }
        else if(arr[i]>max){
            max = arr[i];
        }
    }
    System.out.println(min);
    System.out.println(max);
	}
}
