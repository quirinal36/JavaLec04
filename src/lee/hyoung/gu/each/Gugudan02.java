package lee.hyoung.gu.each;

public class Gugudan02 {

	public static void main(String[] args) {
		int i = 0;
		
		for(i=1; i<9; i++) {
			if(i % 2 == 0) {
				for(int j = 1; j<10; j++) {
					System.out.println(i +"*" + j + "=" + i*j);
				}
				System.out.println("____________________");
			}
		}
	}

}
