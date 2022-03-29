
public class StudentInConstructor {
    String name;
    int rollnumber;
    String address;
    int score;
    StudentInConstructor(String StudentName, int StudentRollerNumber, String StudentAddress){
    	name=StudentName;
    	rollnumber=StudentRollerNumber;
    	address=StudentAddress;
    
    }
    StudentInConstructor(String StudentName, int StudentRollerNumber, String StudentAddress, int StudentScore){
    	name=StudentName;
    	rollnumber=StudentRollerNumber;
    	address=StudentAddress;
    	score=StudentScore;
    	
    }
    void StudentInfo() {
    	System.out.println("Name=" +name);
    	System.out.println("RollNumber=" +rollnumber);
    	System.out.println("Address=" +address);
    	System.out.println("score=" +score);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInConstructor manju= new StudentInConstructor("manju",1452,"saida");
		manju.StudentInfo();
		StudentInConstructor disha= new StudentInConstructor("disha",1252,"ggjhg");
		disha.StudentInfo();
		StudentInConstructor nini= new StudentInConstructor("nini",1982,"gudug",124);
		nini.StudentInfo();
	}

}
