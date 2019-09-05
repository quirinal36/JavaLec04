package lee.hyoung.gu.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class NumbersSort {
	public void execute() {
		System.out.println("start");
		List<Integer> randomList = makeRandomList(100);
		System.out.println("makeRandomList finish");
		showList(randomList);
		sort(randomList, false);
		System.out.println("sort finish");
		showList(randomList);
		
	}
	private List<Integer> makeRandomList(int maxLength){
		List<Integer> result = new ArrayList<Integer>();
		while(result.size() < maxLength) {
			int random = (int)(Math.random() * 100)+1;
			if(!result.contains(random)) {
				result.add(random);
			}
		}
		return result;
	}
	
	private List<Integer> sort(List<Integer>input, boolean isDesc){
		Collections.sort(input, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 > o2) {
					return isDesc?1:-1;
				}else if(o1 < o2) {
					return isDesc?-1:1;
				}else {
					return 0;
				}
			}
		});
		return input;
	}
	
	private void showList(List<Integer>input) {
		Iterator<Integer> iter = input.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next());
			if(iter.hasNext()) {
				System.out.print(",");
			}
		}
		System.out.println();
	}
}
