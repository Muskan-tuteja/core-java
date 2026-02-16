package HashMapDeo;

import java.util.HashMap;

public class HM1 {
	public static void main(String[] args) {
		HashMap a= new HashMap<>();
		System.out.println(a.isEmpty());
		a.put(1,true);
		a.put(2,false);
		a.put(3,null);
	    System.out.println(a);
	    System.out.println(a.size());
	    a.put(3,true);
		a.put(1,false);
		a.put(2,null);
		a.put(4,null);
		 System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		

		}

}
