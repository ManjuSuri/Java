
public class MethodOvrlding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOvrlding ml=new MethodOvrlding();
		//ml.add(20, 30);
		System.out.println(ml.add(20, 30));
		System.out.println(ml.add(20, 30, 30.30f));
		System.out.println(ml.add('h','k'));
	}
 int add(int a,int b){
 return a+b;
 }
 float add(float a, float b) {
	 return a+b;
	 }
 float add(int a, int b, float c) {
	 return a+b+c;
 }
 String add(char a, char b) {
	 return ""+a+b;
	 
 }
 }


