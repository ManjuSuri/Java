
public class thisInJavaExmp {
     int a;
     int b;
     int c;
     int d;
     thisInJavaExmp(){
    	 this(12);
    	 System.out.println("this is 0 arg constructor");              
     }
     thisInJavaExmp(int a){
    	 this(80,58);
    	 System.out.println("this is one arg constructor");              
     }
     thisInJavaExmp(int a,int b){
    	 this(10,20,69);
    	 System.out.println("this is two arg constructor");              
     }
     thisInJavaExmp(int a,int b,int c){
    	 this(30,40,50,40);
    	 System.out.println("this is three arg constructor");              
     }
     thisInJavaExmp(int a,int b,int c, int d){
    	 System.out.println("this is four arg constructor");              
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisInJavaExmp te=new thisInJavaExmp();
	}

}
