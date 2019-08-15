package lee.hyoung.gu.each;

import java.util.Scanner;

public class StringMethodsPractice {
	final static String SIGNS = "!@#$%^&*()-=_+\\|;:'\"/?,.<>~[]{}`";
	final static String BIG_ALPHABETS = "ABCDEFGHIJKLMNOPQLSTUVWXYZ";
	final static String SMALL_ALPHABETS = "abcdefghijklmnopqlstuvwxyz";
	final static String NUMBERS = "0123456789";
	
	public static int main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a;
        a = sc.nextLine();
		if(validPassword(a)) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}
		return 0;
	}
	
	/**
	 * 1. input 8~15
	 * 2. less than 1 Capital Alphabet
	 * 3. less than 1 small Alphabet
	 * 4. less than 1 number
	 * 5. less than 1 sign
	 * 
	 * @param input
	 * @return
	 */
	public static boolean validPassword(String input) {
		boolean result = false;

		final int length = input.length();
		if(length < 8 || length > 15) {
			result = false;
		}
		
		result = isContains(input, SIGNS);
		if(!result)return result;
		
		result = isContains(input, SMALL_ALPHABETS);
		if(!result)return result;
		
		result = isContains(input, BIG_ALPHABETS);
		if(!result)return result;
		
		result = isContains(input, NUMBERS);
		if(!result)return result;
		
		return result;
	}
	private static boolean isContains(final String input, final String dest) {
		final int length = input.length();
		
		for(int i=0; i<length; i++) {
			for(int j=0; j<dest.length(); j++) {
				if(dest.charAt(j) == input.charAt(i)) {
					System.out.print(dest.charAt(j)+"="+input.charAt(i));
					System.out.println("contains");
					return true;
				}
			}
		}
		return false;
	}
}
