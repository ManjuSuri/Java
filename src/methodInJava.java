
public class methodInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MethodDemo md=new MethodDemo();
    int result=md.addTwoNumber(20, 30);
    int multresult=md.mult(6, 5);
    System.out.println("add result="+result + " multres= "+multresult);
    
	}

}
class MethodDemo{
	int addTwoNumber(int a,int b) {
	int c=a+b;
	return c;	
}
	int mult(int a,int b) {
		int c=a*b;
		return c;
	}
}