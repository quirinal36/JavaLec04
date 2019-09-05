package lee.hyoung.gu.algorithm;

public class BinaryPractice {
	
	public void parseBinary(int decimalNum){
		int position = 0;
		int binary[] = new int[20];

		while(decimalNum != 0){
			binary[position++] = decimalNum % 2;

			System.out.printf("decimalNum:%d | 나머지:%d\n", decimalNum, decimalNum % 2);

			decimalNum /= 2;

		}
		int i=0;
		for(i=position-1; i>=0; i--){
			System.out.printf("%d", binary[i]);
		}
		System.out.println();
	}
}
