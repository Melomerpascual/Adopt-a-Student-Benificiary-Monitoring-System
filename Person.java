import java.util.Scanner;
abstract  class Person {
private String lastName;
private String firstName;
private String middleName;
private String userName; 
private String password;
private String contactnumber;
Scanner in = new Scanner (System.in);

Person(){

}

Person (String lastname,String firstname,String middlename,String username,String password,String contactnumber){
this.lastName=lastname;
this.firstName=firstname;
this.middleName=middlename;
this.userName=username;
this.password=password;
this.contactnumber=contactnumber;
}



void changeFirstName(){
    System.out.println("Enter your First Name");
    String name = in.nextLine();
    if(name.isBlank()){
        System.out.println("Error : cannot be empty");
    }else{
        this.firstName=name;
    }
}

void changeLastName(){
    System.out.println("Enter your Last Name:");
    String name = in.nextLine();
    if(name.isBlank()){
        System.out.println("Error : cannot be empty");
    }else{
        this.lastName=name;
    }
}

void changeMiddlename(){
    System.out.print("Enter you Middle Name :");
    String name = in.nextLine();
    if(name.isBlank()){
        System.out.println("Error : cannot be empty");
    }else{
        this.middleName=name;
    }
}

void changePassword(){
System.out.println("Enter your new Password : ");
String pass = in .nextLine();
if(pass.isBlank()){
    System.out.println("Error : cannot be empty");
}else{
    this.password=pass;
}
}

void changeContactNumber(){
    boolean checker =false;
    do{
     
    System.out.println("Enter your new contact number : ");
    String mobile=in.nextLine();
    if (mobile.isBlank()) {
        System.out.println("Error please put a value");
        checker=true;
    }else if (mobile.matches("[0-9]{11}")) {
        this.contactnumber="";
   this.contactnumber=mobile;  
   checker=false;
}else{
  System.out.println("Please put 11 numbers ");
  checker=true;
}
     
    
    }while(checker);
}


public String getFirstName(){
    return this.firstName;
}
  
public String getLastName(){
    return this.lastName;
}

public String getMiddleName(){
    return this.middleName;
}
 
public String getUsername(){
return this.userName;
}

String getPassword(){
return this.password;
}

void viewInfo(){
    System.out.println("__________________________");
   System.out.println("    PERSONAL INFORMATION    ");
    System.out.println("__________________________");
   System.out.println("Name : " + this.firstName+ " " + this.middleName +" "+this.lastName); 
   System.out.println("Contact Number : " + this.contactnumber);
}

}
