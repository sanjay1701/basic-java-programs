package array;

public class FIndSecondHighestInArray {

	private static void SecondHighestNumberInArray(int[] arr, int length) {
		int largest=0, secondLargest=0;
		for(int i=0;i<length;i++) {
			if(arr[i]>largest) {
				secondLargest = largest;   //used to skip iteration when comparing in else if
				largest = arr[i];
			}
			else if(arr[i]>secondLargest) {
				secondLargest=arr[i];
			}
		}
		System.out.println("Second largest number is:" + secondLargest);
	}

	public static void main(String[] args) {
		int arr[] = { 14, 46,100, 35, 94, 94, 52, 86, 36, 94, 89 };
		SecondHighestNumberInArray(arr,arr.length);
	}
}
