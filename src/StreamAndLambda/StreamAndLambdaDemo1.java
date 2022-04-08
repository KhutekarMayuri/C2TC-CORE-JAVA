package StreamAndLambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAndLambdaDemo1 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();

		list.add(12);
		list.add(55);
		list.add(22);
		list.add(33);
		list.add(88);
		list.add(66);
		list.add(15);
		list.add(65);
		
		System.out.println(list);
		
		/*List<Integer> evenList = new ArrayList<Integer>();
		
		for (Integer i:list) {
			
			if(i%2 == 0) {
				
				evenList.add(i);
			}
		}
		System.out.println(evenList);
		*/
		
		Stream<Integer> stream = list.stream();
		List<Integer> evenList1 = stream.filter(i -> i%2 == 0).collect(Collectors.toList()); //filter : to perform operation on some of elements
		System.out.println(evenList1);
		
		long fail = list.stream().filter(i -> i<33).count();
		System.out.println(fail);
		
		Stream<Integer> stream1 = list.stream();
		List<Integer> updatedlist = stream1.map(i-> i+5).collect(Collectors.toList()); //map: to perform operation on all set of elements
		System.out.println(updatedlist);
		
		
	}

}
