import java.util.InputMismatchException;
import java.util.Scanner;
class Faculty extends Person implements Application{

private String college; 
private boolean availability;
private String adoptedStudent=" ";

Scanner in = new Scanner(System.in);
   
    Faculty(){
        
    }
    
   Faculty(String lastname,String firstname,String middlename,String college,String username,String password,String contactnumber){
super(lastname,firstname,middlename,username,password,contactnumber);
   
   } 

void addAdoptedStudent(String name){
this.adoptedStudent+=name;
}


public void viewApplication(){
System.out.println("==========Application============");
    System.out.println("Faculty name :" + getFirstName() +" " + getLastName());
    System.out.println("Applied to :" + viewApplications());
    System.out.println("Status " + getApplicationStatus());
}



public void accept(Account acc){
    try{
System.out.println("Enter name :");
String name = in.nextLine();

if(acc.facultyAccountChecker(name)){
System.out.println("Error");
}else if(acc.studentAccountChecker(name)){
    Person account = acc.findStudentAccount(name);
    Student stu = (Student) account;
    removeApplicant(account.getFirstName() + "" + account.getLastName() );
    addAdoptedStudent(account.getFirstName()+""+account.getLastName());
    account.removeApplication(getFirstName()+""+getLastName());
    stu.setAdopters(getFirstName()+"" +getLastName());
    account.setApplicationStatus("Accepted");
System.out.println("Accepted Succesfully ");
}

    }catch(NullPointerException e){
     System.out.println("Error theres no account existing yet");
    }


}




public void apply(Account acc){
    try{
System.out.println("Enter name : ");
String name = in.nextLine();
if(acc.facultyAccountChecker(name)){
System.out.println("Error: you cant apply to faculty");

}else if(acc.studentAccountChecker(name)){
Person stud = acc.findStudentAccount(name);
addApplications(stud.getFirstName()+stud.getLastName());
stud.addApplicant(getFirstName()+getLastName());
setApplicationStatus("Submited");
}
    }catch(NullPointerException e){
System.out.println("Error theres no account existing yet");
    }

}

/* 
void setAvailability(){

    try{
    System.out.println("Please choose : " + "[1] Available " +"\n" + "[2] Not available");
    int input = in.nextInt();
    if(input==1){
     this.availability=true;
    }else if (input==2){
    this.availability=false;
    } 
    }catch(InputMismatchException e){
    System.out.println("Error invalid input please enter number ");
    }
  
}

*/








void viewInfo(){
    super.viewInfo();
    System.out.println("College : " + this.college);
    
    System.out.println("Availability : " + this.availability);
    System.out.println("Adoption Information : ");
    System.out.println("Adopted Students : " + this.adoptedStudent);
}

public void finishAdoption(){
    
}

void changeCollege(){
      System.out.println("Enter the new college ");
                String college = in.nextLine();
this.college = college;
}

}