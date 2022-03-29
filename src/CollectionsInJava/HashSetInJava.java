package CollectionsInJava;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al2=new ArrayList();
	    al2.add("manju");
	    al2.add("nivi");
	    al2.add(20.62);
    HashSet hs=new HashSet();
    hs.add(30);
    hs.add(40);
    hs.add('c');
    hs.add(30);
    hs.add("java");
    hs.add(null);
    System.out.println(hs);
    System.out.println(hs.add("java"));
    System.out.println(hs);
    hs.addAll(al2);
    System.out.println(hs);
     for(Object element:hs) {
    	 System.out.println(element);
     }
	}

}
