package constructorconcpt;
//Constructor is responsible for initialization of object (for every object constructor will be ...
// ...executed separately for initialization specific to object )
public class ResponsibleExecution {
	String name;
	int rollno;
	ResponsibleExecution(String name,
	int rollno)
	{
		this.name = name;
		this.rollno = rollno;
		
	}

	public static void main(String[] args) {
		ResponsibleExecution stu = new ResponsibleExecution("Ashish",1);
		ResponsibleExecution stu1 = new ResponsibleExecution("priti",1);
		System.out.println(stu.name+""+stu.rollno);
		System.out.println(stu1.name+""+stu.rollno);

	}

}
