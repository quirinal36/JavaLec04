package lee.hyoung.gu.array;

public class UglyArray {
	public static void main(String[] args) {		
		// 배열로 만들어보자
		int nums[] = new int[10];
		for(int i=0; i<5; i++) {
			// 각각의 인데스에 값을 저장하기
			nums[i] = 10 * (i+1);
		}
		
		for(int j=0; j<nums.length; j++) {
			// 배열 안의 값들을 출력하기
			System.out.println("nums => " + nums[j]);
		}
	}
}