
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    login capone=new Newlogin();
    capone.loginApp();
  //  Newlogin city=new Newlogin();
  //  city.loginApp();
	}
}
class login{
	void loginApp() {
		System.out.println("enter user name");
		System.out.println("enter password");
		System.out.println("click submit button");
	}
}
class Newlogin extends login{
	void loginApp() {
		System.out.println("enter user name");
		System.out.println("enter password");
		System.out.println("enter phn number");
		System.out.println("click submit button");
		
		
	}
}
