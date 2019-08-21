package lee.hyoung.gu;

import java.util.Arrays;

import lee.hyoung.gu.sort.ArraySort;

public class MainClass {

	public static void main(String[] args) {
		int array[] = {48,7,1,4,2,0,35,5,11,6,8};
		ArraySort sorts = new ArraySort();
		// sorts.bubbleSort(array);
		sorts.insertionSort(array);
		System.out.println("-- complete --");
		System.out.println(Arrays.toString(array));
	}

}
