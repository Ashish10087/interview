package instancevariable;

 class Student{
	int Rollno;
String name;
}

public class Instancevar {


	public static void main(String[] args) {
		
		Student obj =new Student();
		obj.name ="Sanjay";
		obj.Rollno=10;
		
		
		System.out.println(obj.name);
		System.out.println(obj.Rollno);
		
		
		obj.name="ashish";
		obj.Rollno=20;
		System.out.println(obj.name);
		System.out.println(obj.Rollno);

	}

}
