import java.util.Scanner;
class Student extends Person{
    Scanner in = new Scanner (System.in);
private String college;
private String program;
private String section;
private String year;
String helpNeed;
int studentNumber;

Student(String lastname,String firstname,String middlename,String username,String password,int age,int contactnumber,String college ,String program,String section,String year){
super( lastname,firstname,middlename,username,password,age,contactnumber);
this.college=college;
this.program=program;
this.section=section;
this.year=year;

}
 
void accept(){
    System.out.println("Enter name");
    String name = in.nextLine();
    this.adopters+=name;
}


void viewInfo(){
    super.viewInfo();
    System.out.println("Collge : " + this.college);
    System.out.println("Program : " + this.program);
    System.out.println("Section : " + this.section);
    System.out.println("Year : " + this.year);
    System.out.println("Adopters : " + this.adopters);
}

void changeCollege(){

}

void changeProgram(){

}
void changeSection(){

}

void setHelpNeed(){

}

void changeHelpNeed(){
    
}

}