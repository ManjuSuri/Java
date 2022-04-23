
public class methodInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MethodDemo md=new MethodDemo();
    int result=md.addTwoNumber(20, 30);
    int multresult=md.mult(6, 5);
    int divresult=md.div(50, 2);
    System.out.println("add result="+result + " multres= "+multresult +"div=" +divresult);
    
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
	int div(int a,int b) {
		int c=a/b;
		return c;
		
	}
}