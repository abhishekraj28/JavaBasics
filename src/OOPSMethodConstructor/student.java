package OOPSMethodConstructor;

public class student {

	int sid;
	String sname;
	char grad;
	
	void studentData() {
		System.out.println(sid+"  "+ sname+" "+ grad);
	}
	
	void setStudentData(int id, String name, char ch) {
		sid=id;
		sname=name;
		grad=ch;
	}
	
	student(int id, String name, char ch){
		sid=id;
		sname=name;
		grad=ch;
	}

}
