package array;

/** program to move all non-zero elements left side and zero elements right side
 * @author sanjay
 *
 */
public class MoveAllNonZeroToLeftAndZerotoRight {

	/**
	 * @param arr
	 * @param length
	 */
	public static void moveElements(int[] arr, int length) {

		//Approach-1
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(arr[i]==0) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for(int i = 0; i < length; i++) {
			System.out.print(arr[i]+ " ");
		}
		//Approach - 2
		/*int count=0, lastIndex = arr.length;
		for(int i = 0; i < length; i++) {
			if(arr[i]!=0) {
				arr[count++] = arr[i];
			}
		}
		while(count<lastIndex) {
			arr[count++] = 0;
		}
		for(int i = 0; i < length; i++) {
			System.out.print(arr[i]+ " ");
		}*/

		//Approach-3

		/*int j=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				if(i!=j) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
				j++;
			}
		}
		for(int i =0 ;i<n;i++) {
			System.out.print(arr[i] + " ");
		}*/

	}
	public static void main(String[] args) {
		int[] arr = {3,0,0,0,8,5,4,3,0,0};
		moveElements(arr,arr.length);
	}
}
