package Test;

import java.util.ArrayList;
import java.util.List;

public class Test7opyimize {
	public static List<Integer> findcommon(List<Integer> ar1 , List<Integer>ar2,List<Integer>ar3){
		List<Integer> ref = new ArrayList<>();
		List<Integer> finalis = new ArrayList<>();
		
		for(int num:ar1) {
			if(ar2.contains(num)) {
				ref.add(num);
			}
		}
		for(int num:ref) {
			if(ar3.contains(num)) {
				finalis.add(num);
			}
		}
		return finalis;
		
	}
	public static void main(String[]args) {
		List<Integer> ar1 = List.of(1, 5, 10, 20, 40, 80);
		List<Integer> ar2 = List.of(6, 7,  20,  80,100);
		List<Integer> ar3 = List.of(3,4,15,20,30,70,80,120);
		
		List<Integer> finalis = findcommon(ar1,ar2,ar3);
		for(int num:finalis) {
			System.out.println(num+" ");
		}
		

	}

}
