package CollectionInJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.text.Keymap;
public class HashMapInJava {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap map=new HashMap();
		map.put("1001", "Tom");
		map.put("H1-1002","Hema");
		map.put("abc","jay");
		map.put("1005", "java");
		map.put("1001", "ScriptQA");
		map.put("1009", "ScriptQA");
		map.put(null,  "abc");
		System.out.print(map);
		
for(Object id:map.keySet())	{	
	         System.out.print("id= "+id+" value"+map.get(id));
		}

	}		
			
		}

	









	
	//		System.out.print("Key= "+entry.getVAlue();
//		System.out.print("Value =+entry.getValue());
//		System.out.print();

	

		






//System.out.print(map.containsValue("abc"));

//System.out.print(map);
//System.out.print(map.get(1001));
//
//System.out.print(map.containsValue("abc"));
//
//System.out.print(map);


//for(Entry<String,String> entryset: entrySet()) {
//System.out.print("Key= "+entryset.getKey());
//System.out.print("Value ="+entryset.getValue());
//System.out.println();
//