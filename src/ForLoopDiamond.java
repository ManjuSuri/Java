import java.util.Scanner;

public class ForLoopDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("entert the row");
		//Scanner sc=new Scanner(System.in);
		//int totalrow=sc.nextInt();
	 int totalrow =9;
		
		for(int row=1;row<=totalrow/2+1;row++) {
			
			 for(int sp=row; sp<totalrow/2+1;sp++) { System.out.print(" "); }
			
			for(int st=1;st<=(2*row)+1;st++) {
				System.out.print("*");  
			}
			// for(int sp=row; sp<totalrow/2+1;sp++) { System.out.print(""); }
		System.out.println();
		}
		
		for(int row=0;row<totalrow/2;row++) {
			
			 for(int sp=0; sp<row+1;sp++) { System.out.print(" "); }
			
			for(int st=1;st<=totalrow -(2*row);st++) {
				System.out.print("*");  
			}
			//for(int sp=row; sp<totalrow/2+1;sp++) { System.out.print(""); }
		System.out.println();
		}
		/*
		for(int row=6;row<=totalrow;row++) {
			for(int sp=1; sp<=row-5;sp++) {
				System.out.print("+");	
			}
			for(int st=1; st<=(row*2)-3;st++) {
				System.out.print("*");	
				
	   	}
			
			System.out.println();
		}
		*/
		
	}

}
