package lee.hyoung.gu;

import java.util.Arrays;

import lee.hyoung.gu.method.MethodPractice;
import lee.hyoung.gu.sort.ArraySort;

public class MainClass {

	public static void main(String[] args) {
		
		int array[] = {7,1,48,4,2};//,0,35,5,11,6,8};
		ArraySort sorts = new ArraySort();
//		sorts.bubbleOneLine(array);
		sorts.insertionSortOneline(array, 1);
		sorts.insertionSortOneline(array, 2);
		sorts.insertionSortOneline(array, 3);
		sorts.insertionSortOneline(array, 4);
		// sorts.bubbleSort(array);
		// sorts.insertionSort(array);
		System.out.println("-- complete --");
		System.out.println(Arrays.toString(array));
		
		/*
		MethodPractice practice = new MethodPractice();
		System.out.println(practice.method01(4));
		System.out.println(practice.method02(4));
		System.out.println(practice.method03(4));
		System.out.println(practice.method04(4, 3));
		practice.method05(4);
		practice.method06(4, 8);
		*/
	}

}
