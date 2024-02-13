package constructorconcpt;

public class StaticandConstr {
     int rollno;
     String name;
   static  String college="mgm";
   static void change() {
	   college = "rjc";
			  
   }
   StaticandConstr(int r,String n){
	   rollno=r;
	   name=n;
   }
   void display() {System.out.println(rollno+"--"+name+"---"+college);}
	public static void main(String[] args) {
		StaticandConstr.change();
		StaticandConstr s1= new StaticandConstr(111,"jay");
		StaticandConstr s2 = new StaticandConstr(222,"pratik");
		StaticandConstr s3= new StaticandConstr(333,"pradeep");
		s1.display();
		s2.display();
		s3.display();

	}

}
