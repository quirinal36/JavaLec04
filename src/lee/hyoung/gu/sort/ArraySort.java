package lee.hyoung.gu.sort;

import java.util.Arrays;

public class ArraySort {
	
	/**
	 * 버블정렬
	 * 
	 * @param input
	 */
	public void bubbleSort(int [] input) {
		/*********************************
		 * 		여기에 과제 영역입니다.		*
		 * 								*
		 *********************************/
	}
	
	/**
	 * 버블정렬 한줄
	 * @param input
	 */
	public void bubbleOneLine(int[] input) {
		int length = input.length;
		for(int i=0; i<length-1; i++) {
			if(input[i] > input[i+1]) {
				int temp = input[i];
				input[i] = input[i+1];
				input[i+1] = temp;
			}
		}
	}
	
	
	public void insertionSortOneline(int [] input, int insertIndex) {
		
		final int current = input[insertIndex]; // 비교대상값(current)
		for(int j=insertIndex; j>0; j--) {
			if(current > input[j-1]) {
				break;
			}else {
				insertIndex = j-1; // 직전 왼쪽값부터 가장 왼쪽값 까지 비교대상 비교
				
				// 비교대상값(current)보다 크(거나 같)다면 자리를 한자리씩 오른쪽으로 이동시킨다.
				int temp = input[j];
				input[j] = input[j-1];
				input[j-1] = temp;
			}
		}
		// 비교대상값 보다 작(거나 같)은값 오른쪽에 비교대상값(current)을 삽입한다.
		input[insertIndex] = current;
	}
	/**
	 * 삽입정렬
	 * 
	 * @param input
	 */
	public void insertionSort(int [] input) {
		int length = input.length;
		for(int i=0; i<length-1; i++) {
			int insertIndex=i+1; // 비교대상(current)값 인덱스
			final int current = input[insertIndex]; // 비교대상값(current)
			for(int j=i+1; j>0; j--) {
				if(current > input[j-1]) {
					break;
				}else {
					insertIndex = j-1; // 직전 왼쪽값부터 가장 왼쪽값 까지 비교대상 비교
					
					// 비교대상값(current)보다 크(거나 같)다면 자리를 한자리씩 오른쪽으로 이동시킨다.
					int temp = input[j];
					input[j] = input[j-1];
					input[j-1] = temp;
				}
			}
			// 비교대상값 보다 작(거나 같)은값 오른쪽에 비교대상값(current)을 삽입한다.
			input[insertIndex] = current;
			System.out.println(Arrays.toString(input));
		}
	}
}
