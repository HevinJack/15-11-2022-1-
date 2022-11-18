package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmapold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map ma=new HashMap();
		
		ma.put(1,"amar");
		ma.put(2,"allwin");
		ma.put(6,"kohli");
		ma.put(4,"ashwin");
		
		Set s=ma.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()){
			Map.Entry ent=(Map.Entry)itr.next();
			System.out.println(ent.getKey()+""+ent.getValue());
			
		}
		

	}

}
