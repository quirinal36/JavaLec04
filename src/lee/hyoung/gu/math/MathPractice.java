package lee.hyoung.gu.math;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class MathPractice {
	static Logger logger = Logger.getLogger(MathPractice.class.getSimpleName());
	
	public static void main(String[] args) {
		int average = new MathPractice().upAndDownGame(1, 100);
	}
	
	/**
	 * 
	 * @param TEST_NUM : 표본 구할 횟수
	 * @param STANDARD : 랜덤 숫자 만들어내는 범위
	 * @return
	 */
	public int upAndDownGame(final int TEST_NUM, final int STANDARD) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<TEST_NUM; i++) {
			// 1 ~ 10000 사이의 숫자중 하나를 가져온다.
			final int goal = (int)(Math.random() * STANDARD) + 1;
			System.out.println("goal = " + goal);
			
			boolean result = false;
			System.out.println("result = "+result);
			
			int MAX_NUM = STANDARD;
			int MIN_NUM = 0;
			int count = 0;

			System.out.println("> MAX_NUM = " + MAX_NUM);
			System.out.println("> MIN_NUM = " + MIN_NUM);
			
			System.out.println("------------- start ---------------");
			System.out.println("while(!result){ ");
			while(!result) {
				count ++;
				int answer = (MAX_NUM+MIN_NUM) / 2;

				if(answer > goal) {
					MAX_NUM = answer;
				}else if(answer < goal) {
					MIN_NUM = answer + 1;
				}else if(answer == goal) {
					result = true;
				}
				System.out.println("MIN_NUM | MAX_NUM | answer | result");
				System.out.printf("%5d   |%6d   |%6d  | %b\n",MIN_NUM,MAX_NUM,answer,result);
			}
			System.out.println("}");
			System.out.println("------------- finish -------------");
			list.add(count);
		}
		
		int sum = 0;
		for(int a : list) {
			sum += a;
		}
		int average = (int)(sum / TEST_NUM);
		
		return average;
	}
}
