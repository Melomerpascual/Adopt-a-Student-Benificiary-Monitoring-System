import java.util.Scanner;
class Faculty extends Person{
    String college;
    boolean availablestatus;
    Scanner in = new Scanner(System.in);

    
   Faculty(String lastname,String firstname,String middlename,String username,String password,int age,int contactnumber){
super(lastname,firstname,middlename,username,password,age,contactnumber);
   


   } 


void setStatus(){
    System.out.println("Set your availbility status");
    boolean status =in.nextBoolean();
}

}