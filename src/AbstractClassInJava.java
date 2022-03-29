
public class AbstractClassInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Damo dm=new Damo();
     dm.display();
     dm.show();
     dm.print();
    
	}
}
abstract class Demo{
	void display() {
	System.out.println("this is class a display method");	
	}
	abstract void show();
	abstract void print();
	
}
  class Damo extends Demo{ 
	  void show() {
		  System.out.println("this is class b show method");  
	  }
	  void print() {
		  System.out.println("this is class b print method");
	  }
  }