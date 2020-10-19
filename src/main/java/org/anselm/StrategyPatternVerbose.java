package org.anselm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StrategyPatternVerbose {

	public static Integer getTheSum(List<Integer> list, Predicate<Integer> predicate) {
		Integer sum = 0;
		for(Integer s : list) {
			if(predicate.test(s)) {
				sum += s;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		List<Integer> newList = new ArrayList<>();
		newList.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		System.out.println(getTheSum(newList, e -> e%2 == 0));
	}
}
