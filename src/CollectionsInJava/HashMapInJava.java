package CollectionsInJava;

import java.util.HashMap;
import java.util.Map;

public class HashMapInJava {
	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap();
		map.put("124","cap");
		map.put("147","map");
		map.put("136","sap");
		map.put("abc","nap");
		map.put("al-154","fab");
		map.put("196","sab");
		System.out.println(map);
		System.out.println(map.get("124"));
		System.out.println(map.containsKey("136"));
		System.out.println(map.containsValue("sap"));
		map.remove("147");
		System.out.println(map);
		for(Map.Entry<String,String> entry:map.entrySet()) {
		System.out.print("key=" +entry.getKey());
		System.out.println("Value="+entry.getValue());
		}
			for(Object id:map.keySet()) {
				System.out.println("id=" +id+ "value="+map.get(id));
				
				
			}
			for(Object name:map.keySet()) {
				System.out.println(name);
			}	
	}

}
