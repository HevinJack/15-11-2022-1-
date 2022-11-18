package map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Navigablemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NavigableMap <Integer , String> a=new TreeMap <Integer , String>();
		
		a.put(101,"raj");
		a.put(105, "mari");
		a.put(103, "saravana");
		a.put(107, "kevin");
		
		System.out.println("descending map :"+a.descendingMap());
		System.out.println("head map :"+a.headMap(105,true));
		System.out.println("tail map: "+a.tailMap(103,true));
		System.out.println("sub map: "+a.subMap(101,false,107,true));
		
		
		

	}

}
