class Student extends Person {
   
private String college;
private String program;
private String section;
private String year;
private String helpNeed="";
private String adopters="";
private String studentId;
private String applicationStatus="";
private String application="";
Student(){

}

Student(String lastname,String firstname,String middlename,String username,String password,String contactnumber,String college ,String program,String section,String year,String studentId){
super( lastname,firstname,middlename,username,password,contactnumber);

this.college=college;
this.program=program;
this.section=section;
this.year=year;
this.studentId=studentId;
}
 

public void viewApplication(){
    System.out.println("Application");
    System.out.println("Student name :" + getFirstName() +" " + getLastName());
    System.out.println("Help Need :"+ helpNeed);
    System.out.println("Applied to :" + application);
    System.out.println("Status :" + getApplicationStatus());
}

String getHelpNeed(){
    return this.helpNeed;
}

String getApplication(){
    return this.application;
}

void setApplication(String name){
    this.application=name;
}


void setApplicationStatus(String status){
    this.applicationStatus=status;
}

String getApplicationStatus(){
return this.applicationStatus;
}

 void setAdopters(String name){
    this.adopters=name;
}




    @Override
void viewInfo(){
    super.viewInfo();
        System.out.println("Student Id :"+studentId);

    System.out.println("College : " + this.college);
    System.out.println("Program : " + this.program);
    System.out.println("Section : " + this.section);
    System.out.println("Year : " + this.year);
    System.out.println("Adopters : " + this.adopters);
}

//change your college details 
void changeCollege(){
System.out.println("Enter you college name : ");
String mycollege = in.nextLine();
this.college=mycollege;
}
//Change your current program
void changeProgram(){
System.out.println("Enter the program you changes into : ");
String prog = in.nextLine();
this.program=prog;
}

void changeSection(){
System.out.println("Enter your new Section : ");
String mysection = in.nextLine();
this.section=mysection;
}
//student define what kind of help they needed
void setHelpNeed(){
System.out.println("Describe or list out the help that you need : ");
String help = in.nextLine();
if(help.isBlank()){
System.out.println("Invalid input please put something ");
}else if(this.helpNeed.isBlank()){
    this.helpNeed=help;
}else {
    this.helpNeed+=", "+help;
}

}


void removeHelpNeed(){
    this.helpNeed="";
}
}