package lee.hyoung.gu.array;

import java.util.Scanner;

public class PasswordValidation {
	final static String SIGNS = "!@#$%^&*()-=_+\\|;:'\"/?,.<>~[]{}`";
	final static String BIG_ALPHABETS = "ABCDEFGHIJKLMNOPQLSTUVWXYZ";
	final static String SMALL_ALPHABETS = "abcdefghijklmnopqlstuvwxyz";
	final static String NUMBERS = "0123456789";
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String input;
        input = scanner.nextLine();
        scanner.close();
        String [] arrStr = input.split("");
        if(arrStr.length >= 8 && arrStr.length <= 15) {
        	System.out.println("입력한 비밀번호는 8자 이상 15자 이하 입니다.");
        }else {
        	
        }
        
        boolean result = false;
        for(int i=0; i<arrStr.length; i++) {
        	if(result = SIGNS.contains(arrStr[i])) {
        		break;
        	}
        }
        
        if(result == true) {
        	System.out.println("비밀번호에 기호(SIGN)가 포함되어 있습니다.");
        }else {
        	System.out.println("비밀번호에 기호(SIGN)가 포함되어 있지 않습니다.");
        }
        
        result = false;
        for(int i=0; i<arrStr.length; i++) {
        	if(result = NUMBERS.contains(arrStr[i])) {
        		break;
        	}
        }
        
        if(result == true) {
        	System.out.println("비밀번호에 숫자(NUMBERS)가 포함되어 있습니다.");
        }else {
        	System.out.println("비밀번호에 숫자(NUMBERS)가 포함되어 있지 않습니다.");
        }
        
        result = false;
        for(int i=0; i<arrStr.length; i++) {
        	if(result = BIG_ALPHABETS.contains(arrStr[i])) {
        		break;
        	}
        }
        if(result) {
        	System.out.println("비밀번호에 대문자(BIG_ALPHABETS)가 포함되어 있습니다.");
        }else {
        	System.out.println("비밀번호에 대문자(BIG_ALPHABETS)가 포함되어 있지 않습니다.");
        }
        
        result = false;
        for(int i=0; i<arrStr.length; i++) {
        	if(result = SMALL_ALPHABETS.contains(arrStr[i])) {
        		break;
        	}
        }
        if(result) {
        	System.out.println("비밀번호에 대문자(SMALL_ALPHABETS)가 포함되어 있습니다.");
        }else {
        	System.out.println("비밀번호에 대문자(SMALL_ALPHABETS)가 포함되어 있지 않습니다.");
        }
	}

}
