package bubblesort;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] values = {5,1,7,4,3,6,9,8,2};
		System.out.println(Arrays.toString(values));
		System.out.println(Arrays.toString(bubblesort(values)));
	}
	static int[] bubblesort(int[] b){
		int temp;
		for (int j = b.length; j > 0; j--) {
			for (int i = 0; i < j-1; i++) {
				if (b[i]>b[i+1]) {
					temp = b[i];
					b[i] = b[i+1];
					b[i+1] = temp;
				}
			}
		}
		return b;
	}
}
