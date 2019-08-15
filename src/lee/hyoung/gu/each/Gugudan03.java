package lee.hyoung.gu.each;

public class Gugudan03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2, j = 1;
		
		for(;i<10;i++) {
			System.out.println(i+" step");
			for(j = 1;j<10;j++) {
				if(j <= i) {
					// System.out.println(i +"*" + j + "=" + i*j);
					System.out.printf("%2d *%2d =%2d\n",i,j,i*j);
				}
			}
			System.out.println("____________________");
		}
	}

}
