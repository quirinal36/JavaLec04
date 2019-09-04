package lee.hyoung.gu.list;

public class ListTest {

	public static void main(String[] args) {
		int a = 1;
		int b = 0;
	    while(a <= 5 && b <= 5){       
	        a = a+1;
	        b = b+a;
	        System.out.print("a: " + a);
	        System.out.println(" | b: " + b);
	    }                      
	}
}
