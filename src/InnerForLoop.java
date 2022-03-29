import java.util.Scanner;
public class InnerForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("entert the row");
		Scanner sc=new Scanner(System.in);
		int totalrow=sc.nextInt();
		//int totalrow =7;
		
		for(int row=1;row<=totalrow;row++) {
			for(int sp=0; sp<=row-1;sp++) {
				System.out.print(" ");	
			}
			for(int st=1;st<=(2*totalrow)-(row*2)+1;st++) {
				System.out.print("*");  
			}
			//for(int sp=0; sp<=row-1;sp++) {
				//System.out.print("");	
			//}
			System.out.println();
		}
		
	}

}
