
public class DemoInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Aim a;
 a=new Bob();
 a.display();
 a.show();
 a=new Dad();
 a.display();
 a.show();
	}

}
interface Aim{
	void display();
	void show();
}
class Bob implements Aim{
	public void display(){
		System.out.println("this display method of class a");
	}
	public void show() {
		System.out.println("this show method of class a");	
	}
}
class Dad implements Aim{
	public void display(){
		System.out.println("this display method of class d");
	}
	public void show() {
		System.out.println("this show method of class d");	
	}
}