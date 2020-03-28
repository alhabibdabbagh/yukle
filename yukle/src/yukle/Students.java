package yukle;

public class Students {
String id ;
String name;
float salary;
boolean IsMarried;
String haveChilddren; 
int age;
short balance;
float gps;
int passOfHours;





public void  getInfo(String Id, String Name, float Salary , boolean ismarried, int Age,String child) {
	this.name=Name;
	this.id=Id;
	this.salary=Salary;
	this.IsMarried=ismarried;
	this.age=Age;
	this.haveChilddren=child;
}
public void yazdir() {
	System.out.println("id yazdirma"+id+ " \n name:"+name+"\nSalary"+salary+"\\nMarried:"+IsMarried+"\\nage:"+age+"\\nchild:"+haveChilddren);
}
public  void getInfoForStudents (short Balance, float Gps, int Passofhours) {
	this.balance=Balance;
	this.gps=Gps;
	this.passOfHours=Passofhours;
}
public void studentsPrint (boolean Isokay) {
	if (Isokay) {
	System.out.println("Balance:\n"+balance+"\n gps:"+gps+"\npassofHours:"+passOfHours);
	System.out.println("is gruted");
	}else {
		System.out.println("not gratued");
	}
}
public boolean isGrauted() {
	if (58<gps && gps<60) {
		gps++;
	}
	if (balance>=0 && gps>=60 && passOfHours>=140) {
		return true;
	}else {
		return false;
	}
}
}
