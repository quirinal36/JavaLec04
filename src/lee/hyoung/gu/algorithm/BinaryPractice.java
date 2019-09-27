package lee.hyoung.gu.algorithm;

/**
 * 10진수를 2진수로 변경하기
 * 
 * @author 이형구
 * @since 2019.09.05
 */
public class BinaryPractice {
	public void parseDecimal(String binaryStr) {
		String binaries[] = binaryStr.split("");
		int binary[] = new int [binaries.length];
		for(int i=0; i<binaries.length; i++) {
			binary[i] = Integer.parseInt(binaries[i]);
		}
		int position = binary.length-1;
		int decimal = 0;
		int opnd = 1;
		for(; position>=0; position--){
			decimal += binary[position] * opnd;
			System.out.printf("%d +", binary[position]*opnd);
			opnd*=2;
		}
		
		System.out.println("= " + decimal);
	}
	public void parseBinary(int decimalNum){
		System.out.println("입력된 숫자 : " + decimalNum);
		int position = 0;
		int binary[] = new int[20];

		while(decimalNum != 0){
			binary[position++] = decimalNum % 2;

			decimalNum /= 2;
			System.out.printf("몫:%3d | 나머지:%2d\n", decimalNum, decimalNum % 2);
		}
		
		int i=0;
		for(i=position-1; i>=0; i--){
			System.out.printf("%d", binary[i]);
		}
		System.out.println();
	}
}
