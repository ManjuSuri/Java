
public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=11;
    for(int i=2; i<number;i++) {
    	if(number%i==0) {
    		System.out.println("this number is not a prime number"+number);
    		return;
    	}
    	
    }
    System.out.println("this number is a prime number"+number);
	}

}
