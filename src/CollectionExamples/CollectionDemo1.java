package CollectionExamples;

import java.util.*;

public class CollectionDemo1 {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();  
		
		l.add(56);
		l.add(45.78);
		l.add("M11");
		l.add('a');
		l.add(null);
		
		l.add(2,"Mayuri");
		
		l.remove(2);
		
		System.out.println(l);
	}

}
