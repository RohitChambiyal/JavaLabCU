import java.util.*;
public class ReverseArray
{
	public static void main(String[] args) {
    int arr[] = {5,1,1,23,54,33,22,-11,32};
    int i=0;
    int j = arr.length-1;
    int temp =0;
    while(i<j){
        temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }
    for(int x:arr)
        System.out.print(x+" ");
}
}
