package lee.hyoung.gu.algorithm;

/**
 * 좌우 대칭인 문자열을 Palindrome 이라고한다.
 * 입력된 문자열이 Palindrome 인지 판별하는 프로그램을 만들자.
 * 
 * @author turbo
 *
 */
public class PalindromeInt {

	public boolean get(String inputStr) {
		boolean isPalindrome = true;
		
		int input = Integer.parseInt(inputStr);
		int inputArr[] = new int[inputStr.length()];
		
		for(int i=0; i<inputArr.length; i++) {
			inputArr[i] = input % 10;
			input /= 10; // input = input / 10;
		}
		
		for(int i=0; i<inputArr.length/2; i++) {
			if(inputArr[i] != inputArr[inputArr.length-1-i]) {
				isPalindrome = false;
				break;
			}
		}
		
		return isPalindrome;
	}
}
