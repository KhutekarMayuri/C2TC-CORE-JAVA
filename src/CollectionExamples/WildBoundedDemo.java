package CollectionExamples;

import java.util.Arrays;
import java.util.List;

public class WildBoundedDemo {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		System.out.println(sum(list1));
		
		List<Double> list2 = Arrays.asList(1.0,2.22,3.33,4.44);
		System.out.println(sum(list2));
	}

	//sum Operation
	static double sum(List<? extends Number>list) {
		
		double sum = 0.0;
		for(Number i: list) {
			sum +=i.intValue();
		}
		return sum;
	}
}