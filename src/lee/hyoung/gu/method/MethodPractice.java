package lee.hyoung.gu.method;

public class MethodPractice {

	/**
	 * (매개변수 + 3) 의 결과를 계산해주는 메소드
	 * 
	 * @param x
	 * @return
	 */
	public int method01(int x) {
		int y = x + 3;
		return y;
	}
	
	/**
	 * (매개변수 * 2 + 7) 의 결과를 계산해주는 메소드
	 * 
	 * @param x
	 * @return
	 */
	public int method02(int x) {
		int y = 2*x + 7;
		return y;
	}
	
	/**
	 * (매개변수의 2배) + (매개변수 제곱) 결과를 계산해주는 메소드
	 * @param x
	 * @return
	 */
	public int method03(int x) {
		int y = 2*x + (int)Math.pow(x, 2);
		return y;
	}
	
	/**
	 * x^2 + 2y + xy
	 * 매개변수가 2개이면서 계산결과를 위 계산결과를 반환하는 메소드
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public int method04(int x, int y) {
		int z = x*x + y*2 + x*y;
		return z;
	}
	
	/**
	 * 매개변수 x 단 구구단 출력해주는 메소드
	 * 
	 * @param x
	 */
	public void method05(final int x) {
		for(int i = 1; i<10; i++) {
			System.out.printf("%2d *%2d =%2d\n", x , i, x*i);
		}
	}
	
	/**
	 * 구구단 x 단부터 y 단까지 출력하는 메소드
	 * 
	 * @param x
	 * @param y
	 */
	public void method06(final int x, final int y) {
		for(int i = x; i<=y; i++) {
			for(int j = 1; j<10; j++) {
				System.out.printf("%2d *%2d =%2d\n", i , j, i*j);
			}
		}
	}
}
