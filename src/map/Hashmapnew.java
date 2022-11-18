package map;

import java.util.HashMap;
import java.util.Map;

public class Hashmapnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Integer , String> ma=new HashMap <Integer , String >();
		
		ma.put(1,"jack");
		ma.put(3,"kevin");
		ma.put(2,"ram");
		
		for(Map.Entry a:ma.entrySet()){
			System.out.println(a.getKey()+""+a.getValue());
			
			
		}
	}

}
