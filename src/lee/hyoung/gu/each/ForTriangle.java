package lee.hyoung.gu.each;

public class ForTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		final int horizon = 7;
		for(i=0; i<4; i++) {
			for(int j=0;j<horizon;j++) {
				if(horizon/2-i <= j && horizon/2+i >= j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		/*
		3~3 = 7/2
		2~4 = 7/2-1 + 7/2+1
		1~5 = 7/2-2 + 7/2+1
		0~6 = 7/2-3 + 7/2+3
		*/
		
		for(i=2; i>=0; i--) {
			for(int j=0;j<horizon;j++) {
				if(horizon/2-i <= j && horizon/2+i >= j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		/*
		3~3 = 7/2
		2~4 = 7/2-1 + 7/2+1
		1~5 = 7/2-2 + 7/2+1
		0~6 = 7/2-3 + 7/2+3
		1~5 = 7/2-2 + 7/2+1
		2~4 = 7/2-1 + 7/2+1
		3~3 = 7/2 
		 */
		
		for(i=0; i<horizon; i++) {
			int start;
			int end;
			if(i > horizon/2) {
				start = horizon + i - 10;
				end = horizon - i + 2;
			}else {
				start = horizon/2-i;
				end = horizon/2+i;
			}
			for(int j=0;j<horizon;j++) {
				if(start <= j && end >= j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		/*
		 7 ? 4 = 1  
		 7 ? 5 = 2
		 7 ? 6 = 3
		 ____________
		 7 ? 4 = 5
		 7 ? 5 = 4
		 7 ? 6 = 3
		*/
	}

}
