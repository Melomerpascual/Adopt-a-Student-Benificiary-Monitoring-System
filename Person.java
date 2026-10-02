    class Person{
private String lastname;
private String firstname;
private String middlename;
private String username; 
private String password;
private int age;
private int contactnumber;
Person next;
Person prev;

Person (String lastname,String firstname,String middlename,String username,String password,int age,int contactnumber){
this.lastname=lastname;
this.firstname=firstname;
this.middlename=middlename;
this.username=username;
this.password=password;
this.age=age;
this.contactnumber=contactnumber;
}

 
public String getUsername(){
return this.username;
}

String getPassword(){
return this.password;
}




}