public class thisInJava {
    String name;
    int rollnumber;
    String address;
    int score;
    int maxscore;
    thisInJava(String name, int rollnumber, String address){
    	this(name,rollnumber,address,100);
    	this.name=name;
    	this.rollnumber=rollnumber;
    	this.address=address;
    	
    
    }
    thisInJava(String name, int rollnumber, String address,int score){
    	this(name,rollnumber,address,score,1000);
    	this.name=name;
    	
    	this.rollnumber=rollnumber;
    	this.address=address;
    	this.score=score;
    	
    }
    
    thisInJava(String name, int rollnumber, String address,int score,int maxscore){
    	this.name=name;
    	
    	this.rollnumber=rollnumber;
    	this.address=address;
    	this.score=score;
    	this.maxscore=maxscore;
    	
    }
    void StudentInfo() {
    	System.out.println("Name=" +name);
    	System.out.println("RollNumber=" +rollnumber);
    	System.out.println("Address=" +address);
    	System.out.println("score=" +score);
    	System.out.println("max score=" +maxscore);
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisInJava t= new thisInJava("manju",1452,"saida");
		t.StudentInfo();
		thisInJava disha= new thisInJava("disha",1252,"ggjhg");
		disha.StudentInfo();
		thisInJava nini= new thisInJava("nini",1982,"gudug",124);
		nini.StudentInfo();
		thisInJava suri= new thisInJava("suri",1902,"guindy",104,2000);
		suri.StudentInfo();
		
	}

}
