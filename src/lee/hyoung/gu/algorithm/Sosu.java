package lee.hyoung.gu.algorithm;

import javax.swing.JOptionPane;

public class Sosu {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("숫자를 입력하세요.");
		int decimal = Integer.parseInt(input);
		
		Sosu sosu = new Sosu();
		// System.out.println("isSosu? : " + sosu.test(decimal));
		System.out.println("sosu sum : "+ sosu.sumSosu(decimal));
	}
	public boolean test(int num) {
		boolean isSosu = true;
		int i;
		
	    for(i=2; i < num; i++){
	      if(num % i == 0){
	        isSosu = false;
	        break;
	      }
	    }
	    
		return isSosu;
	}
	
	public int sumSosu(int num) {
		int sum = 0;
		int current = 2;
		
		int count = 0;
		while(current <= num) {
			if(test(current)) {
				count++;
				System.out.println("sosu: " + current);
				sum += current;
			}
			current++;
		}
		System.out.println("count: " + count);
		return sum;
	}
}
