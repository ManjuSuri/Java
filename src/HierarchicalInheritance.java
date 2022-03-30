
public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vegetable v=new Vegetable();
		//v.display();
		Onion o=new Onion();
		System.out.println("this is onion child");
		o.display();
		o.display1();
		Tomato t=new Tomato();
		System.out.println("this is tomato child");
		t.display();
		t.display2();
		Beans b=new Beans();
		b.display1();
		b.demo();
		Carrot ct=new Carrot();
		ct.demo1();
	}

}
class Vegetable{
	int a=5;
	int b=4;
	int display() {
		int c=a+b;
		System.out.println("vegetable="+c);
		return c;
	}
}
class Onion extends Vegetable{
	int s=8;
	int t=7;
	int display1() {
		int u=s+t;
		System.out.println("onion="+u);
		return u;
	}
	
}
class Beans extends Onion{
        int demo() {
		int q=5;
		System.out.println("Beans="+q);
		return q;
	}
	
}
class Tomato extends Vegetable{
	int e=8;
	int d=7;
	int display2() {
		int f=e+d;
		System.out.println("Tomato="+f);
		return f;
	}
}
class Carrot extends Tomato{
    int demo1() {
	int r=5;
	System.out.println("carrot="+r);
	return r;
}
}
class Cauliflower extends Carrot{
    int demo3() {
	int r=5;
	//int s;
	System.out.println("carrot="+r);
	return r;
}
}