import java.util.Scanner;
class Faculty extends Person {
private String college ; 
private String facultyId;
private String adoptedStudent="";
private String applicant="";
   
    Faculty(){
        
    }
    
   Faculty(String lastname,String firstname,String middlename,String college,String username,String password,String contactnumber,String facultyId){
super(lastname,firstname,middlename,username,password,contactnumber);
   this.facultyId=facultyId;
   this.college=college;
   } 

void setAdoptedStudent(String name){
this.adoptedStudent=name;
}   



String getAdoptedStudent(){
    return this.adoptedStudent;
}


void addApplicant(String name){
    this.applicant+=" "+name+" ";
}

void removeApplicant(String name){
this.applicant=this.applicant.replace(" "+name+" ","");
}

String getApplicant(){
    return this.applicant;
}


@Override
void viewInfo(){
    super.viewInfo();
    System.out.println("College :" + this.college);
    System.out.println("Faculty id :" + facultyId);
    System.out.println("Adoption Information :"+ adoptedStudent);
}



void changeCollege(){
System.out.println("Enter the new college ");
String mycollege = in.nextLine();
this.college = mycollege;
}






}