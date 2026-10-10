import java.util.InputMismatchException;
import java.util.Scanner;
class Faculty extends Person{

private String college; 
private boolean availability;
private String adoptedStudent=" ";

Scanner in = new Scanner(System.in);
   
    Faculty(){
        
    }
    
   Faculty(String lastname,String firstname,String middlename,String username,String password,int contactnumber){
super(lastname,firstname,middlename,username,password,contactnumber);
   
   } 

void addAdoptedStudent(String name){
this.adoptedStudent+=name;
}





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
void viewInfo(){
    super.viewInfo();
    System.out.println("College : " + this.college);
    
    System.out.println("Availability : " + this.availability);
    System.out.println("Adoption Information : ");
    System.out.println("Adopted Students : " + this.adoptedStudent);
}


}