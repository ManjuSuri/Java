package CollectionsInJava;

import java.util.ArrayList;

public class ArrayListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al2=new ArrayList();
	    al2.add("manju");
	    al2.add("nivi");
	    al2.add(20.62);
	    
	    ArrayList al3=new ArrayList();
	    al3.add("manju");
	    al3.add("nivi");
	    al3.add(20.62);
    ArrayList al=new ArrayList();
    al.add("arra");
    al.add("nini");
    al.add("suri");
    al.add(12);
    al.add(10.10f);
    al.add("disha");
    al.add(20);
    al.add(20.20f);
    al.add(null);
    al.add(1,20.20f);
  //  System.out.println(al.get(2));
    al.addAll(2,al2);
  al2.add(545);
  
  System.out.println(al);
  System.out.println(al3);
  al.set(0, "arran");
  //al.removeAll(al2);
//  System.out.println(al.lastIndexOf(20));
 // al2.clear();
    System.out.println(al.size());
    System.out.println(al);
   // System.out.println(al.containsAll(al2));
//    for(String s:al) {
//    	System.out.println(s);
//    }
  //  for(Object e:al) {
    //	System.out.println(e);
    }
  
	}

