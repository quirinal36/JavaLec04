package lee.hyoung.gu.algorithm;

public class Factorial {
	
	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		System.out.println(">>"+ factorial.get(6));
	}
	
	public long get(int n) {
		if(n == 1) {
			return 1;
		}else {
			return n * get(n-1);
		}
	}
}
