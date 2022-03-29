
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //String s="   java is /simple lang/is/   ";
  //  String s4="JAVA IS /SIMPLE LANG/IS/";
  //  String s1=" java is simple lang";
  //  String s3=new String("java is simple lang");
   /* System.out.println(s);
    System.out.println(s.charAt(5));
    System.out.println(s.substring(5));
    System.out.println(s.substring(5,14));
    System.out.println(s.equals(s3));
   System.out.println(s.equalsIgnoreCase(s1));
   System.out.println(s==s3);
   
   String t1="Jackie";
   String t2="Jackie";
   String t3= new String("Jackie");
   System.out.println(t1==t2);
   System.out.println(t1==t3);
   System.out.println(t1.equals(t3));
   System.out.println(t1.equals(t2));*/
    //System.out.println(s.isEmpty());
   // System.out.println(s.isBlank());
    //String s4=s.concat(s1);
   // System.out.println(s4);
    //System.out.println(s.replace("java","c#"));
   // String straArr[]=s.split("/");
   // for(int i=0;i<straArr.length;i++) {
   // 	System.out.println(straArr[i]);
  //  }
   // System.out.println(s.indexOf('/', 9));
   // System.out.println(s.toUpperCase());
  //  System.out.println(s4.toLowerCase());
  //  System.out.println(s.trim());
		String s="hello java welcome";
		StringBuffer sb=new StringBuffer("Hello java welcome");
		StringBuilder sb1=new StringBuilder("sfdfdfdf");
		System.out.println(s);
		s.concat("to the class");
		System.out.println(s);
		sb.append("to the class");
		System.out.println(sb);
		System.out.println("new string="+s.concat("to the class"));
	}

}
