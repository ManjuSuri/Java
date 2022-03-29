
public class MinOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20,455,40,25,3,};
		int i=0;
	    int minNumber=a[i];
	    for(i=0;i<a.length;i++) {
	    	if(a[i]<minNumber) {
	    		minNumber=a[i];
	    	}
	    }
	    System.out.println("minNumber is "+minNumber);
	}

}
