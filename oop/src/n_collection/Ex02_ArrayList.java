package n_collection;

import java.util.ArrayList;
import java.util.Collections;

public class Ex02_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("rabbit");
		list.add("cat");
		list.add("dog");
		list.add("fox");
		list.add("ant");

		System.out.println(list);
		
		list.set(3, "lion");
		System.out.println(list);
		
		list.add("tiger");
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
//		for(String temp : list) {
//			System.out.println(temp);
//		}
//		
//		for(int i=0; i<list.size(); i++) {
//			String obj = (String)list.get(i);
//			System.out.println(obj);
//		}
		
		
	}

}
