package Wrapper;

import java.util.ArrayList;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList<Integer> a= new ArrayList<Integer>();
		System.out.println(a.isEmpty());
		a.add(7);
		a.add(8);
		a.add(0);
		a.add(8);
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		

		}

}
