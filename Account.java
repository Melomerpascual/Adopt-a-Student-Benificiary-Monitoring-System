import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
//regex input error handling
//Account class that handle account related behaviours
class Account{
  private  StudentNode head;
private FacultyNode head2;
Scanner in = new Scanner (System.in);
  
//Create account method
void createAccount(){
    boolean checker = false;
   //need error traping for blank string inputs
    do {
        try{
       System.out.println("==============================="); 
       System.out.println("=========EduNet Care===========");
       System.out.println("===============================");
       System.out.println("Are you a student or teacher ?");
        System.out.println("[1] Student ");
        System.out.println("[2] Teacher ");
        System.out.println("------------------------------");
        int input = in.nextInt();
        //Student
          if(input==1){
        in.nextLine();

    System.out.println("Enter your first name : ");
    String firstname = in.nextLine();
    if(firstname.isBlank()){
        System.out.println("Error : cannot be empty");
        break;
      }
    System.out.println("Enter your last name : ");
    String lastname = in.nextLine();
      if(lastname.isBlank()){
        System.out.println("Error : cannot be empty");
        break;
      }
    System.out.println("Enter your middle name : ");
    String middlename=in.nextLine();
if(middlename.isBlank()){
System.out.println("Error : cannot be empty");
        break;
}
    System.out.println("Username : ");
    String username = in.nextLine();
if(username.isBlank()){
System.out.println("Error : cannot be empty");
        break;
}
    System.out.println("Password : ");
    String password = in.nextLine();
if(password.isBlank()){
System.out.println("Error : cannot be empty");
        break;
}
    
    System.out.println("Enter your contact number : ");
    String contactnumber = in.nextLine();
    if(contactnumber.contains(".")){
     System.out.println("Error : you cannot put . ");
     break;
    }else if(contactnumber.length()!=11){
     System.out.println("Error please put a valid number ");
     break;
    }
    


    System.out.println("College");
    String college = in.nextLine();
if(college.isBlank()){
System.out.println("Error : cannot be empty");
        break;
}
    System.out.println("Program ");
    String program = in.nextLine();
if(program.isBlank()){
System.out.println("Error : cannot be empty");
        break;
}
    System.out.println("Section");
    String section = in.nextLine();
    if(section.isBlank()){
System.out.println("Error : cannot be empty");
        break;
}
    System.out.println("Year");
    String year = in.nextLine();
if(year.isBlank()){
System.out.println("Error : cannot be empty");
        break;
}
    Student stud = new Student( lastname, firstname, middlename, username,password, contactnumber,college,program,section,year);
    StudentNode node = new StudentNode(stud);
  if(head==null){
    head=node;
    }else{
    StudentNode nod = head;
    while(nod.next!=null){
    nod=nod.next;
    }
    nod.next=node;
         }checker = false;
         //Faculty account
    }else if (input==2){
    in.nextLine();
   System.out.println("Enter your first name : ");
    String firstname = in.nextLine();
 if(firstname.trim().isBlank()){
        System.out.println("Error : cannot be empty");
        break;
      }
    System.out.println("Enter your last name : ");
    String lastname = in.nextLine();
      if(lastname.trim().isBlank()){
        System.out.println("Error : cannot be empty");
        break;
      }
    System.out.println("Enter your middle name : ");
    String middlename=in.nextLine();
if(middlename.isBlank()){
System.out.println("Error : cannot be empty");
        break;
}

System.out.println("Enter your College ");
String college = in.nextLine();
if (college.trim().isBlank()) {
    System.out.println("Error please put a value:");
}

    System.out.println("Username : ");
    String username = in.nextLine();
if(username.trim().isBlank()){
System.out.println("Error : cannot be empty");
        break;
}
    System.out.println("Password : ");
    String password = in.nextLine();
    if(password.trim().isBlank()){
System.out.println("Error : cannot be empty");
        break;
}
    System.out.println("Enter your contact number : ");
    String contactnumber = in.nextLine();

    Faculty faculty = new Faculty(lastname,firstname,middlename,college, username,password, contactnumber);

    FacultyNode nodes = new FacultyNode(faculty);

if(head2==null){
head2=nodes;
}else{
    FacultyNode node = head2;
    while(node.next!=null){
node=node.next;
    }
    node.next=nodes;
}
}
checker = false;
   }catch(InputMismatchException e){
    System.out.println("Error : Invalid input please enter a number");
    String inp = in.nextLine();
     checker =true;
   }
    }while(checker);
}

    Person findStudentAccount(String name){
    StudentNode stud = head;
 
    while(stud!=null){
           Student student = stud.getData();
           if(student.getFirstName().equals(name)||student.getLastName().equals(name)||student.getMiddleName().equals(name)){
           return student;
        }
stud=stud.next;
    }
    return null;
}





//checks if student actually exist
boolean studentAccountChecker(String name){
try {
StudentNode node = head;
Student data = node.getData();
while(node!=null){
if(data.getFirstName().equals(name)){
return true;
}
node = node.next;
}
}catch(NullPointerException e ){
System.out.println("Error : Theres no registered Faculty Account existing yet ");
}
return false;
}




//check if faculty exist using its namme

boolean facultyAccountChecker(String name){
    try{

    }catch(NullPointerException e){
    System.out.println("Error theres no account yet : ");
    }
FacultyNode node = head2;
String facultyname=node.getData().getFirstName();
String facultylastname = node.getData().getLastName();
while(node != null ){
if(name.equalsIgnoreCase(facultyname) ||name.equalsIgnoreCase(facultylastname) ){
return true;
}

     node = node.next;
}
return false ;
}







// returns the real faculty, or null if not found
Person findFacultyAccount(String name){

    FacultyNode node = head2;

    while(node != null){
        Faculty faculty = node.getData();
        String fullName = faculty.getFirstName() + " " + faculty.getLastName();

        if(faculty.getFirstName().equalsIgnoreCase(name)
           || faculty.getLastName().equalsIgnoreCase(name)
           || faculty.getMiddleName().equalsIgnoreCase(name)
           || fullName.equalsIgnoreCase(name)){
            return faculty;
        }
        node = node.next;
    }

    return null;
}





  //Login Method  
Person login(){
    
    System.out.println("Enter your username : ");
    String username = in.next();

    System.out.println("Enter your password : ");
    String password = in.next();
   
    StudentNode nod = head;

    while (nod != null) {

     Student stud =nod.getData();

         if (stud.getUsername().equals(username) &&
            stud.getPassword().equals(password)) {

            System.out.println("This is student");
            return stud;
        }

        nod = nod.next;
    }

    FacultyNode nodes = head2;

    while (nodes != null) {

        Faculty faculty = nodes.getData();

        if (faculty.getUsername().equals(username) &&
            faculty.getPassword().equals(password)) {

            System.out.println("This is faculty");
            return faculty;
        }

        nodes = nodes.next;
    }

    return null;
}



























//Search account method
String searchAccount(String name){
    try{
StudentNode nod = head;

    while (nod != null) {

        Student stud = nod.getData();

        if (stud.getFirstName().equalsIgnoreCase(name)||stud.getLastName().equalsIgnoreCase(name)||stud.getMiddleName().equalsIgnoreCase(name)){
        
            return   stud.getFirstName()+stud.getMiddleName()+stud.getLastName();
        }
        nod=nod.next;
    }
FacultyNode node = head2;
while(node!=null){
    Faculty faculty = node.getData();
    if(faculty.getFirstName().equalsIgnoreCase(name)||faculty.getLastName().equalsIgnoreCase(name)||faculty.getMiddleName().equalsIgnoreCase(name)){
 String facultyWholeName=faculty.getFirstName()+faculty.getMiddleName()+faculty.getLastName();

 return facultyWholeName;
    }
    node=node.next;
    }
    
    }catch(NullPointerException e){
    System.out.println("Error no account existing yet");
    }return "Not found";
}
}