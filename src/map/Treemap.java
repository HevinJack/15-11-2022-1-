package map;

import java.util.Map;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap <Integer, String> a=new TreeMap<Integer , String>();
		
		a.put(1,"amit");
		a.put(3, "sha");
		a.put(2, "modi");
		a.put(4, "bharat");
		
		a.remove(1);
		
		for(Map.Entry m:a.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
	}

}
