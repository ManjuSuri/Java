
public class compoundAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		candidate c=new candidate();
		int result=c.demo(14);
		if(result<18) {
		System.out.println("you are  not eliglible  " +result);
		} 
		else if(result>18) {
			System.out.println("you are eliglible  " +result);
		}
	}
} 

class candidate{
		int demo(int a) {
		return a;
			}		
}