package yukle;

import java.util.Scanner;

public class HAbuhdsa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("dkbjaskjdbkasjbkjasdbkjsabkdkjbas");
//Students student =new Students();
Students[] studentDizi =new Students[2];
Scanner s1=new Scanner(System.in);
//student.getInfo("4", "sddas", 5452.25f, true,15);
/*student.yazdir();
for (int i = 0; i < s.length; i++) {
	//s[i]=student.getInfo("4", "sddas", 5452.25f, true);
	student.yazdir();
}
student.name="habib";
System.out.println(student.name);
for (int i = 0; i < s.length; i++) {
	

System.out.println("enter your balance ");
student.balance=s1.nextShort();
System.out.println("enter your gps ");
student.gps=s1.nextFloat();
System.out.println("are you married ");
student.IsMarried=s1.nextBoolean();
System.out.println("enter your passofhours ");
student.passOfHours=s1.nextInt();
System.out.println("did you have childern ");
student.haveChilddren=s1.next();
System.out.println("enter your id  ");
student.id=s1.next();
student.getInfo(student.id, student.name, student.salary, student.IsMarried, student.age,student.haveChilddren);
student.getInfoForStudents(student.balance, student.gps, student.passOfHours);
s[i]=student;

}for (Students  student1 :s) {
	
	boolean Grauted=student1.isGrauted();
	student1.studentsPrint(Grauted);
	
	System.out.println("sdjabdjkasbd");
}
//s1.close();*/

for (int j = 0; j < studentDizi.length; j++) {
	

System.out.println("enter your balance ");
short balance=s1.nextShort();
System.out.println("enter your gps ");
float gps=s1.nextFloat();
System.out.println("enter your passofhours ");
int passOfHours=s1.nextInt();
Students student =new Students();//??? niye disardan object uretimde son  dongudeki degerleri verir ama icerden uretimde her  dongu degeri veriri
student.balance=balance;
student.gps=gps;
student.passOfHours=passOfHours;
studentDizi[j]=student;
}
for(Students a : studentDizi) {
	if (a.balance>=0 && a.gps>=60 && a.passOfHours>=140) {
		System.out.println("is gruated ");
		
	}else {
		System.out.println("is not ");
	}
}
s1.close();

	}

}
