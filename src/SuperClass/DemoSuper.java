package SuperClass;

public class DemoSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  B b= new B();
  b.display();
	}

}
class A{
	int a=40;
	void show() {
		System.out.println("this is a show method of class a");
	}
}
class B extends A{
	int a=50;
	void show() {
		System.out.println("this is a show method of class b");
	}
	void display(){
		super.show();
		System.out.println(super.a);
	}
}