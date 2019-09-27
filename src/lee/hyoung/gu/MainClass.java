package lee.hyoung.gu;

import javax.swing.JOptionPane;

import lee.hyoung.gu.algorithm.BinaryPractice;
import lee.hyoung.gu.algorithm.Fibonacci;
import lee.hyoung.gu.algorithm.PalindromeInt;

public class MainClass {
	
	public static void main(String[] args) {
		//BinaryPractice binaryPractice = new BinaryPractice();
		Fibonacci fib = new Fibonacci();
		// PalindromeInt pal = new PalindromeInt();
		
		String input = JOptionPane.showInputDialog("몇번째 숫자를 출력할까요?");
		// int decimal = Integer.parseInt(input);
		
		// boolean result = pal.get(input);
		
		System.out.println("RESULT: " + fib.get(Integer.parseInt(input)));
	}

}
