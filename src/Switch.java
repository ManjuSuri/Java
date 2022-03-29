import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("enter the option");
		Scanner sc= new Scanner(System.in);
		a = sc.nextInt();
		switch (a){
		case 1:{
			System.out.println("SUNDAY");
			break;
		}
		case 2:{
			System.out.println("monday");
			break;
		}
		case 3:{
			System.out.println("tuesday");
			break;
		}
		case 4:{
			System.out.println("wednesday");
			break;
		}
		case 5:{
			System.out.println("Thursday");
			break;
		}
		case 6:{
			System.out.println("friday");
			break;
		}
		case 7:{
			System.out.println("saturday");
			break;
		}
		default:
			System.out.println("enter option 1 to 7");
		
		}
		
		
		}
    
	}
