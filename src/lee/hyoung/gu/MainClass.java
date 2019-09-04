package lee.hyoung.gu;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		int k = 0;
		while(list.size() <= 100 && k<500) {
			k++;
			System.out.println("list.size(): " + list.size());
			int random = (int)(Math.random() * 100);
			System.out.println("random: " + random);
			if(list.contains(random)) {
				continue;
			}else {
				// 값을 넣는다.
				list.add(random);
			}
		}
		
		// 리스트의 모든 값을 출력해보기
		for(int i=0; i<list.size(); i++) {
			// System.out.println(list.get(i));
		}
	}

}
