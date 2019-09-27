package lee.hyoung.gu.algorithm;

import java.time.Duration;
import java.time.LocalTime;

import javax.swing.JOptionPane;

public class Fibonacci {
	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("num"));
		
		for(int i = 0; i < 20; i++) {
			LocalTime time1 = LocalTime.now();
			System.out.println("fibonacci " + (num-i) + " = " + fib.get(num-i));
			LocalTime time2 = LocalTime.now();
			Duration duration = Duration.between(time1, time2);
			
			System.out.println("걸린시간 : " + duration.getSeconds());
		}
	}
	public long get(int num) {
		
		if(num == 1) {
			return 1;
		}else if(num == 2) {
			return 1;
		}else {
			return get(num-2) + get(num-1);
		}
	}
}
