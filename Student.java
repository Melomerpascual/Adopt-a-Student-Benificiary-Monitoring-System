import java.util.Scanner;
class Student extends Person implements Application{
    Scanner in = new Scanner (System.in);
private String college;
private String program;
private String section;
private String year;
private String helpNeed;
private String adopters;

Student(){

}

Student(String lastname,String firstname,String middlename,String username,String password,String contactnumber,String college ,String program,String section,String year){
super( lastname,firstname,middlename,username,password,contactnumber);

this.college=college;
this.program=program;
this.section=section;
this.year=year;

}
 
 
//need ng existing application before accepting
public void accept(Account acc){
    try{
     System.out.println("Enter name :");
String name = in.nextLine();

if(acc.studentAccountChecker(name)){
System.out.println("Error");
}else if(acc.facultyAccountChecker(name)){
    Person account = acc.findFacultyAccount(name);
    Faculty faculty = (Faculty) account;
    removeApplicant(account.getFirstName() + "" + account.getLastName() );
    String fullName = account.getFirstName()+""+account.getLastName();
   setAdopters(fullName);
    account.removeApplication(getFirstName()+""+getLastName());
    faculty.addAdoptedStudent(getFirstName()+"" +getLastName());
    account.setApplicationStatus("Accepted");
System.out.println("Accepted Succesfully ");
}
    }catch(NullPointerException e){
        System.out.println("Error theres no account existing yet ");
    }


}




public void apply(Account acc){
   try{
System.out.println("Enter name : ");
String name = in.nextLine();

 Person faculty = acc.findFacultyAccount(name);

 if(acc.studentAccountChecker(name)){
  System.out.println("Invalid please enter a valid faculty name");

 }else if(acc.facultyAccountChecker(name)){
    String fullName=faculty.getFirstName()+" "+faculty.getLastName();
addApplications(fullName);
faculty.addApplicant(getFirstName() + "" + getLastName() +"");
setApplicationStatus("Submited");

}
   }catch(NullPointerException E ){
System.out.println("Error : theres no account Existing yet");
   }

}

public void viewApplication(){
    System.out.println("______________________Application____________________");
    System.out.println("Student name :" + getFirstName() +" " + getLastName());
    System.out.println("Applied to :" + viewApplications());
    System.out.println("Status :" + getApplicationStatus());
}



String getAdopters(){
return this.adopters;
}



void setAdopters(String name){
    this.adopters=name;
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



String getHelpNeed(){
    return this.helpNeed;
}


void removeHelpNeed(){
    this.helpNeed= " ";
}

}