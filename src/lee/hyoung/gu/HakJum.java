package lee.hyoung.gu;

import javax.swing.JOptionPane;

public class HakJum {

	public static void main(String[] args) {
		int myHp = 100;
		int bossHp = 100;
		
		myHp = myHp - 99;
		bossHp = bossHp - 100;
		
		if(myHp > 0 && bossHp <= 0) {
			System.out.println("my win");
		}else if(myHp <= 0 && bossHp <= 0) {
			System.out.println("draw");
		}else if(myHp <= 0 && bossHp > 0) {
			System.out.println("boss win");
		}
		
		// ! : NOT 연산자는 boolean앞에 사용 할 수 있다.
		System.out.println(!true);
		System.out.println(!false);
	}

}
