package array;

public class SortArray {

	private static void sortArray(int[] array, int length) {
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(array[i]>array[j])
				{
					int temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		int array[] = {12, 45, 1, -1, 0, 4, 56, 23, 89, -21, 56, 27};
		sortArray(array, array.length);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
	}
}
