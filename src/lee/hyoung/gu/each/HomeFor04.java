package lee.hyoung.gu.each;

public class HomeFor04 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=4;j>=0;j--) {
				if(j>i) {
					System.out.print("☆");
				}else {
					System.out.print("★");
				}
			}
			System.out.println();
		}
		
		/*
		 4,3,2,1=>☆  0=>★
		 4,3,2=>☆  0,1=>★
		 4,3=>☆  0,1,2=>★
		 4=>☆  0,1,2,3=>★
		 =>☆ 0,1,2,3,4=>★
		 */
		
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j<i) {
					System.out.print("☆");
				}else {
					System.out.print("★");
				}
			}
			System.out.println();
		}
		/*
		 =>☆ 0,1,2,3,4=>★
		 0=>☆  1,2,3,4=>★
		 0,1=>☆  2,3,4=>★
		 0,1,2=>☆  3,4=>★
		 0,1,2,3=>☆  4=>★
		 */
	}
	
}
