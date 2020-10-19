package org.anselm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StrategyPatternLightweight {
	public static Integer getTheSum(List<Integer> list, Predicate<Integer> predicate) {
		/*return list.stream()
					.filter(predicate)
					.reduce(0, Integer::sum);
		*/
		return list.stream()
					.filter(predicate)
					.mapToInt(e -> e)
					.sum();
	}
	
	public static void main(String[] args) {
		List<Integer> newList = new ArrayList<>();
		newList.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		System.out.println(getTheSum(newList, e -> e%2 == 0));
		System.out.println(getTheSum(newList, Util::isOdd));
	}
}

//Library of functions
class Util {
	public static boolean isOdd(int number) {
		return number % 2 != 0;
	}
}