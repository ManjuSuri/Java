package SuperClass;

public class SuperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Cc c=new Cc();
	}

}
class Aa {
	Aa(){
		System.out.println("Aa class 0 args constructor");
	}
	Aa(int a,int b){
		System.out.println("Aa class 2 args constructor "  +a +" " +b);
	}
}
class Bb extends Aa{
	Bb(){
		super(20,30);
		System.out.println("Bb class 0 args constructor");
	}
	Bb(int a){
		
		
		System.out.println("Bb class 1 args constructor"+a);
	}
}
class Cc extends Bb{
	Cc(){
		super(10);
		System.out.println("Cc class 0 args constructor");
	}
}