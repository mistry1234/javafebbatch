package CollectionInJava;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetInJava {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	ArrayList al2= new ArrayList();
	al2.add("Tom");
	al2.add("C#");
	al2.add("75.75");
	
	
		HashSet hs= new HashSet<>();
		hs.add(30);
		hs.add(40);
		hs.add('c');
		hs.add("java");
		hs.add(30);
		hs.add(null);
		System.out.print(hs);
		System.out.print(hs.add("Hema"));
		System.out.print(hs);
		hs.addAll(al2);
		System.out.print(hs);
		for (Object element:hs) {
           System.out.print(element);
		}
	
		

}	


}