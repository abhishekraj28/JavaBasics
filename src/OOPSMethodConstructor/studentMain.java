package OOPSMethodConstructor;

public class studentMain {

	public static void main(String[] args) {

        //student std=new student();

		
		//using object reference vairable
		
        /*std.sid=1;
		std.sname="John";
		std.grad='A';
		std.studentData();
		*/
        
        //using method
		
		/*std.setStudentData(2, "Jack", 'B');
		  std.studentData();
		*/
        
		//using constructor
		student std=new student(3, "David", 'C');
		std.studentData();
	}

}
