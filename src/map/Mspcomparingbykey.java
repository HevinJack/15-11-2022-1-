package map;

import java.util.HashMap;
import java.util.Map;

public class Mspcomparingbykey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map <Integer, String> a=new HashMap <Integer, String>();
		
		a.put(104, "raj");
		a.put(102, "arul");
		a.put(101, "shankar");
		
		a.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		
		
		

	}

}
