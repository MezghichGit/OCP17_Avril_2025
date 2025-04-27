package day8_27042025;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExempleList {

	public static void main(String[] args) {
		/*List<String> list = new ArrayList<>();
		list.add("SD"); // [SD]
		list.add(0, "NY"); // [NY,SD]
		list.set(1, "FL"); // [NY,FL]
		list.remove("NY"); // [FL]
		list.remove(0); // []*/
		
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.offer(10);
		stack.offer(20);
		stack.push(4); //change ArrayDeque en LIFO
		stack.offer(5);
		stack.push(14);
		// 4,10,20,5
		System.out.println(stack); 
		System.out.println(stack.peek()); // 
		System.out.println(stack.poll()); // 
		System.out.println(stack.poll()); // 
		System.out.println(stack.peek()); // 
		System.out.println(stack);
		Set<Integer>set = new TreeSet<>();
		set.add(null);


	}

}
