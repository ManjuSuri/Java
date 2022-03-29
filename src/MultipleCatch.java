
public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int c=40;
			String s=null;
    int a[]= {10,20,30};
    int b=a[1]/1; //if /0,it will start executing this line it will go to catch block(arithmetic exception)
    System.out.println(a[2]);//if a[4],Array index out 	of bounds,it will go catch block
    s.length();//null pointer exception
	}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException Block");
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e){
			System.out.println("NullPointerException Block");
			System.out.println(e.getMessage());
		}
	  catch(ArithmeticException e){
			System.out.println("ArithmeticException Block");
			System.out.println(e.getMessage());
		}
		catch(Exception e){ // if you dont handle exception in specific it will come this catch block
			System.out.println("Exception Block");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally Block");
		}
	}
}
