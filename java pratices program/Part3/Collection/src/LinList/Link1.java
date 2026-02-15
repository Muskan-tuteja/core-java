package LinList;


import java.util.LinkedList;

public class Link1 {
	public static void main(String[] args) {
		LinkedList<Boolean> a= new LinkedList<>();
		System.out.println(a.isEmpty());
		a.add(true);
		a.add(false);
		a.add(null);
	    System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		

		}

}
