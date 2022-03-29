
public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100; int b=200; int c=300; int d=100;
	
		if(a>b && a>c && a>d) {
			System.out.println("a is greater");
		}
		else if(b>c && b>d && b>a) {
			System.out.println("b is greater");
		}else if(c>a && c>b && c>d){
			System.out.println("c is greater");
		}
			else {
				System.out.println("d is greater");
			}
			}

	}
