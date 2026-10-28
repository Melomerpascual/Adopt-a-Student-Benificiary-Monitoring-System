import java.util.InputMismatchException;
import java.util.Scanner;


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
            System.out.println("""
          ___________________________
            CREATE ACCOUNT
            Are you a student or teacher 
            1. Student
            2. Teacher
            3. Exit
           __________________________""");
        
        int input = in.nextInt();
        in.nextLine();
        
if(input==1){
    System.out.print("Enter your first name : ");
    String firstname = in.nextLine();
    if(firstname.isBlank()){
        System.out.println("Error : cannot be empty");
        break;
      }

    System.out.print("Enter your last name : ");
    String lastname = in.nextLine();
      if(lastname.isBlank()){
        System.out.println("Error : cannot be empty");
        break;
      }

    System.out.print("Enter your middle name : ");
    String middlename=in.nextLine();
if(middlename.isBlank()){
System.out.println("Error : cannot be empty");
        break;
}

    System.out.print("Username : ");
    String username = in.nextLine();
if(username.isBlank()){
System.out.println("Error : cannot be empty");
        break;
}else if (userNameChecker(username)) {
    System.out.println("Error : username taken");
    break;
}

    System.out.print("Password : ");
    String password = in.nextLine();
if(password.isBlank()){
System.out.println("Error : cannot be empty");
        break;
}
    
    System.out.print("Enter your contact number : ");
    String contactnumber = in.nextLine();
    if(contactnumber.contains(".")){
     System.out.println("Error : you cannot put . ");
     break;
    }else if(!contactnumber.matches("[0-9]{11}")){
     System.out.println("Error please put a valid number ");
     break;
    }
    

System.out.print("Enter your Student ID : ");
String studentId = in.nextLine();
if(studentId.isBlank()){
System.out.println("Error : cannot be empty");
        break;
}



   System.out.print("College(e.g. CICT) : ");
    String college = in.nextLine();
if(college.isBlank()){
System.out.println("Error : cannot be empty");
        break;
}

    System.out.print("Program(e.g. BSIT) : ");
    String program = in.nextLine();
if(program.isBlank()){
System.out.println("Error : cannot be empty");
        break;
}
    System.out.print("Section : ");
    String section = in.nextLine();
    if(section.isBlank()){
System.out.println("Error : cannot be empty");
        break;
}
    System.out.print("Year level : ");
    String year = in.nextLine();
if(year.isBlank()){
System.out.println("Error : cannot be empty");
        break;
}
    Student stud = new Student( lastname, firstname, middlename, username,password, contactnumber,college,program,section,year,studentId);
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
    }
    
    
    else if (input==2){
   System.out.print("Enter your first name : ");
    String firstname = in.nextLine();
 if(firstname.trim().isBlank()){
        System.out.println("Error : cannot be empty");
        break;
      }
    System.out.print("Enter your last name : ");
    String lastname = in.nextLine();
      if(lastname.trim().isBlank()){
        System.out.println("Error : cannot be empty");
        break;
      }
    System.out.print("Enter your middle name : ");
    String middlename=in.nextLine();
if(middlename.isBlank()){
System.out.println("Error : cannot be empty");
        break;
}


System.out.print("Enter your faculty ID :");
String facultyId=in.nextLine();
if(facultyId.isBlank()){
    System.out.println("Error : cannot be empty");
    break;
}


System.out.print("Enter your college : ");
String college = in.nextLine();
if (college.trim().isBlank()) {
    System.out.println("Error please put a value:");
    break;
}

    System.out.print("Username : ");
    String username = in.nextLine();
   
if(username.trim().isBlank()){
System.out.println("Error : cannot be empty");
        break;
}else if (userNameChecker(username)) {
    System.out.println("Error : username taken");
    break;
}
    System.out.print("Password : ");
    String password = in.nextLine();
    if(password.trim().isBlank()){
System.out.println("Error : cannot be empty");
        break;
}
    System.out.print("Enter your contact number : ");
    String contactnumber = in.nextLine();
    if(!contactnumber.matches("[0-9]{11}")){
     System.out.println("Error please put a valid number ");
     break;
    }

    Faculty faculty = new Faculty(lastname,firstname,middlename,college, username,password, contactnumber,facultyId);

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
}else if (input == 3 ){
    break;
}else{
    System.out.println("Error : please choose 1 to 3");
    checker = true;
    continue;
}
checker = false;
   }catch(InputMismatchException e){
    System.out.println("Error : Invalid input please enter a number");
     in.nextLine();
     checker =true;
   }
    }while(checker);
}





boolean userNameChecker(String username){
StudentNode node = head;
while (node!=null) { 
    Student stud = node.getData();
    if (stud.getUsername().equals(username)) {
        return true;
    }
    node=node.next;
}

FacultyNode fnode = head2;
while (fnode!=null) { 
    Faculty faculty = fnode.getData();
    if (faculty.getUsername().equals(username)) {
       return true;
    }
    fnode=fnode.next;
}
return false;
}

    Student findStudentAccount(String name){
    StudentNode stud = head;
 
   while(stud!=null){
           Student student = stud.getData();
           if(student.getFirstName().equals(name)||student.getLastName().equals(name)||student.getMiddleName().equals(name)||(student.getFirstName()+" "+student.getLastName()).equals(name)){
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
while(node!=null){
Student data = node.getData();
if(data.getFirstName().equals(name)||data.getLastName().equals(name)||(data.getFirstName()+" "+data.getLastName()).equals(name)){
return true;
}
node = node.next;
}
}catch(NullPointerException e ){
System.out.println("Error : Theres no registered Student Account existing yet ");
}
return false;
}




boolean facultyAccountChecker(String name){
    try{
FacultyNode node = head2;
while(node != null ){
String facultyname=node.getData().getFirstName();
String facultylastname = node.getData().getLastName();
if(name.equalsIgnoreCase(facultyname) ||name.equalsIgnoreCase(facultylastname) ||name.equalsIgnoreCase(facultyname+" "+facultylastname)){
return true;
}

     node = node.next;
}
    }catch(NullPointerException e){
    System.out.println("Error theres no account yet : ");
    }

return false ;
}

// returns the real faculty, or null if not found
Faculty findFacultyAccount(String name){

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
    
    System.out.print("Enter your username : ");
    String username = in.nextLine();

    System.out.print("Enter your password : ");
    String password = in.nextLine();
   
    StudentNode nod = head;

    while (nod != null) {

     Student stud =nod.getData();

         if (stud.getUsername().equals(username) &&
            stud.getPassword().equals(password)) {

            return stud;
        }

        nod = nod.next;
    }

    FacultyNode nodes = head2;

    while (nodes != null) {

        Faculty faculty = nodes.getData();

        if (faculty.getUsername().equals(username) &&
            faculty.getPassword().equals(password)) {

            return faculty;
        }

        nodes = nodes.next;
    }

    return null;
}



void searchAccount(String name){
    try{
        boolean checker =true;
StudentNode nod = head;

    while (nod != null) {

        Student stud = nod.getData();

        if (stud.getFirstName().equalsIgnoreCase(name)||stud.getLastName().equalsIgnoreCase(name)||stud.getMiddleName().equalsIgnoreCase(name)){
        
             stud.viewInfo();
             checker=false;
        }
        nod=nod.next;
    }
FacultyNode node = head2;
while(node!=null){
    Faculty faculty = node.getData();
    if(faculty.getFirstName().equalsIgnoreCase(name)||faculty.getLastName().equalsIgnoreCase(name)||faculty.getMiddleName().equalsIgnoreCase(name)){
faculty.viewInfo();
checker=false;
    }
    node=node.next;
    }
if(checker){
System.out.println("No account found");
}
    
    }catch(NullPointerException e){
    System.out.println("Error no account existing yet");
    }
   
}
}