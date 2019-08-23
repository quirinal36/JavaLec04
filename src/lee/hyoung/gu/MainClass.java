package lee.hyoung.gu;

import lee.hyoung.gu.method.MethodPractice;
import lee.hyoung.gu.sort.ArraySort;

public class MainClass {
	
	public static void main(String[] args) {
		int array[] = {5,4,3,2,1};
		
		ArraySort sort = new ArraySort();
		sort.bubbleSort(array);
	}

}
