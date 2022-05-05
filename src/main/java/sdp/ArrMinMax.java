package sdp;
import java.util.*;

public class ArrMinMax {
	public void mainFunc() {
		int arr[], n, i;
        System.out.println("Enter the size of an array:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the array elements af size :" + n);
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        getMinMax(arr);
	}
	
	public static int[] getMinMax(int[] arr) {
		int max, min, i;
		max = min = arr[0];
        for (i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("The maximum and minimum element of array is " + max + " and " + min);
        int arr1[] = {min, max};
        return arr1;
	}
}
