package myDemoProj;

public class BubbleSort {
	
	public static void bubble_sort(int arr[], int n) {
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}

	public static void main(String[] args) {

		int myarr[] = {10, 5, 7, 23, 77, 1, 54, 5};
		int len = myarr.length;
		
		bubble_sort(myarr, len);
		for(int ele : myarr) {
			System.out.print(ele+ " ");
		}
		
		
	}

}
