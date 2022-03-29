
public class arrayOfMaxnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {20,455,4000,25,15,30};
    int maxNumber=0;
    for(int i=0;i<a.length;i++) {
    	if(a[i]>maxNumber) {
    		maxNumber=a[i];
    	}
    }
  System.out.println("maxNumber is "+maxNumber);
	}

}
