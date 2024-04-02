import java.util.Arrays;

public class DSA {

	public static void main(String[] args) {
		System.out.println("==================ARRAY=================");
		int[] arr = {5, 3, 9, 1, 7};
        bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
	
       
	}

	//Bubble Sort
	private static void bubbleSort(int[] arr) {
		
		  int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
		
	}}
