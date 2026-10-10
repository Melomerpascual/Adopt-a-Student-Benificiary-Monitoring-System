import java.util.InputMismatchException;
import java.util.Scanner;
class Person{
private String lastname;
private String firstname;
private String middlename;
private String username; 
private String password;
private int contactnumber;
private String applications= " ";


Scanner in = new Scanner (System.in);

Person(){

}

Person (String lastname,String firstname,String middlename,String username,String password,int contactnumber){
this.lastname=lastname;
this.firstname=firstname;
this.middlename=middlename;
this.username=username;
this.password=password;
this.contactnumber=contactnumber;
}



String viewApplications(){
    return this.applications;
}

void changeUsername(){
System.out.println("Enter your new username : ");
String username = in.nextLine();
this.username=username;
}

void changePassword(){
System.out.println("Enter your new Password : ");
String pass = in .nextLine();
this.password=pass;
}
void changeContactNumber(){
    boolean checker =false;
    do{
         try{
      System.out.println("Enter your new mobile number : ");
    int mobile=in.nextInt();
    this.contactnumber=mobile;
    checker = false;  
    }catch(InputMismatchException e){
    checker = true;
    }
    }while(checker);
   
  

}
public String getFirstName(){
    return this.firstname;
}
  void addApplications(String name){
        this.applications+=name;
    }
public String getLastName(){
    return this.lastname;
}

public String getMiddleName(){
    return this.middlename;
}
 
public String getUsername(){
return this.username;
}

String getPassword(){
return this.password;
}


void viewInfo(){
    System.out.println(" Personal Information ");
   System.out.println("Name : " + this.firstname+ " " + this.middlename +" "+this.lastname); 
   System.out.println("Contact Number : " + this.contactnumber);
   System.out.println("Applications : " + this.applications);
}

}