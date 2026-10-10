import java.util.Scanner;
class Student extends Person{
    Scanner in = new Scanner (System.in);
private String college;
private String program;
private String section;
private String year;
private String helpNeed;
private String adopters="";

Student(){

}

Student(String lastname,String firstname,String middlename,String username,String password,int contactnumber,String college ,String program,String section,String year){
super( lastname,firstname,middlename,username,password,contactnumber);

this.college=college;
this.program=program;
this.section=section;
this.year=year;

}
 
void addAdopters(String name){
    this.adopters+= " " + name;
}


//View Personal info
void viewInfo(){
    super.viewInfo();
    System.out.println("Collge : " + this.college);
    System.out.println("Program : " + this.program);
    System.out.println("Section : " + this.section);
    System.out.println("Year : " + this.year);
    System.out.println("Adopters : " + this.adopters);
}

//change your college details 
void changeCollege(){
System.out.println("Enter you college name : ");
String college = in.nextLine();
this.college=college;
}
//Change your current program
void changeProgram(){
System.out.println("Enter the program you changes into : ");
String prog = in.nextLine();
this.program=prog;
}
//change section
void changeSection(){
System.out.println("Enter your new Section : ");
String section = in.nextLine();
this.section=section;
}
//student define what kind of help they needed
void setHelpNeed(){
System.out.println("Describe or list out the help that you need : ");
String help = in.nextLine();
if(help.isBlank()){
System.out.println("Invalid input please put something ");
}else {
    this.helpNeed+=help;
}

}

void removeHelpNeed(){
    this.helpNeed= " ";
}

}