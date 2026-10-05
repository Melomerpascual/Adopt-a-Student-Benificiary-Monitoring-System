import java.util.Scanner;
class Person{
private String lastname;
private String firstname;
private String middlename;
private String username; 
private String password;
private int age;
private int contactnumber;
String applications;
String status;
Scanner in = new Scanner (System.in);
Person (String lastname,String firstname,String middlename,String username,String password,int age,int contactnumber){
this.lastname=lastname;
this.firstname=firstname;
this.middlename=middlename;
this.username=username;
this.password=password;
this.age=age;
this.contactnumber=contactnumber;
}
void setName(){

}

void changeUsername(){

}


void changeUsername(){

}

void changeAge(){

}
void changeContactNumber(){
    
}
public String getFirstName(){
    return this.firstname;
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




void apply(){
System.out.println("Enter the name you want to be adopt/odopter");
String name = in.nextLine();
this.applications+=name;
}

void accept(){
System.out.println("Enter name you want to accept :");
String name =in.nextLine();
this.applications+=name;
}

void viewInfo(){
   System.out.println("Name : " + this.firstname+this.middlename+this.lastname); 
   System.out.println("Age : " + this.age);
   System.out.println("Contact Number : " + this.contactnumber);
   System.out.println("Applications : " + this.applications);
}

}