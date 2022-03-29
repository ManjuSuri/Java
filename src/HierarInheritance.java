
public class HierarInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Bb b=new Bb();
  System.out.println("a="+b.a + "b="+b.b);
  b.display();
  b.show();
  Cc c=new Cc();
  System.out.println("a="+c.a +"c=" +c.c);
  c.display();
  c.print();
	}
}
class Aa	 {
	int a=20;
	void display() {
		System.out.println("this is display method of a");
		
	}
}
class Bb extends Aa{
	int b=30;
	void show(){
		System.out.println("this is display method of b"+a);	
	}
}
class Cc extends Aa{
	int c=40;
	void print(){
		System.out.println("this is display method of c");
	}
}