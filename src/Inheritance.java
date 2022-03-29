
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  C c = new C();
  c.display();
  c.display1();
  c.display2();
	}

}
  class A{
	  void display() {
		  System.out.println("parent class");
	  }
  }
  class B extends A {
	  void display1() {
		  System.out.println("child class");
	  }
  }
	  class C extends B {
		  void display2() {
			  System.out.println("child classc");
		  }  
	  }
