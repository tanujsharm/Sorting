package sorting;


public class Newsort {

	static void sort(int arr[]) {
		int size = arr.length;
		
		for(int i=0; i<size; i++) {
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1] =arr[j];
				j -= 1;
			}
			arr[j+1] = key;
		}
	}

	public static void main(String[] args) {
		int arr[] = {34,27,87,13,9,12,87,94,37,55};
		
		System.out.print("Array before sorting: ");
		for(int i: arr) {
			System.out.print(i+" ");
		}
		
		sort(arr);
		
		System.out.print("\nArray after sorting: ");
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}

}