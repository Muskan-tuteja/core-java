package InterfaceDemo;

import java.util.Stack;

public class Demo3 {
	public static void main(String[] args) {
		Stack<Comparable> a= new Stack<>();
		System.out.println(a.isEmpty());
		a.add(7);
		a.add("Hii");
		a.add(true);
		a.add(null);
		System.out.println(a);
		System.out.println(a.isEmpty());

		}

}
