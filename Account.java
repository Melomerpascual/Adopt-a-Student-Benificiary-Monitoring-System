import java.util.InputMismatchException;
import java.util.Scanner;
class Account{
    StudentNode top;
    FacultyNode top2;
Scanner in = new Scanner (System.in);
  

void createAccount(){

System.out.println("Are you a student or teacher ?");
System.out.println("[1] Student ");
System.out.println("[2] Teacher ");
int input = in.nextInt();
if(input==1){
     in.nextLine();

    System.out.println("Enter your first name : ");
    String firstname = in.nextLine();

    System.out.println("Enter your last name : ");
    String lastname = in.nextLine();

    System.out.println("Enter your middle name : ");
    String middlename=in.nextLine();

    System.out.println("Username : ");
    String username = in.nextLine();

    System.out.println("Password : ");
    String password = in.nextLine();

    System.out.println("Enter your age : ");
    int age= in .nextInt();
    
    

    System.out.println("Enter your contact number : ");
    int contactnumber = in.nextInt();
    
    in.nextLine();

    System.out.println("College");
    String college = in.nextLine();

    System.out.println("Program ");
    String program = in.nextLine();

    System.out.println("Section");
    String section = in.nextLine();

    System.out.println("Year");
    String year = in.nextLine();

Student stud = new Student( lastname, firstname, middlename, username,password, age, contactnumber,college,program,section,year);
StudentNode node = new StudentNode(stud);

if(top==null){
top=node;
}else{
    StudentNode nod = top;
    while(nod.next!=null){
nod=nod.next;
    }
    nod.next=node;
}
}else if (input==2){
    in.nextLine();
System.out.println("Enter your first name : ");
    String firstname = in.nextLine();
    System.out.println("Enter your last name : ");
    String lastname = in.nextLine();
    System.out.println("Enter your middle name : ");
    String middlename=in.nextLine();
    System.out.println("Username : ");
    String username = in.nextLine();
    System.out.println("Password : ");
    String password = in.nextLine();

    System.out.println("Enter your age : ");
    int age= in .nextInt();
    
    System.out.println("Enter your contact number : ");
    int contactnumber = in.nextInt();
Faculty faculty = new Faculty( lastname,firstname,middlename, username,password, age, contactnumber);


FacultyNode nodes = new FacultyNode(faculty);



if(top2==null){
top2=nodes;
}else{
    FacultyNode nodese = top2;
    while(nodese.next!=null){
nodese=nodese.next;
    }
    nodese.next=nodes;
}
}

    




}
    
Person login(){
    

    System.out.println("Enter your username : ");
    String username = in.next();

    System.out.println("Enter your password : ");
    String password = in.next();

   
    StudentNode nod = top;

    while (nod != null) {

        Student stud = nod.getData();

        if (stud.getUsername().equals(username) &&
            stud.getPassword().equals(password)) {

            System.out.println("This is student");
            return stud;
        }

        nod = nod.next;
    }

    FacultyNode nodes = top2;

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
void searchAccount(String name){
    
 StudentNode nod = top;

    while (nod != null) {

        Student stud = nod.getData();

        if (stud.getFirstName().equalsIgnoreCase(name)||stud.getLastName().equalsIgnoreCase(name)||stud.getMiddleName().equalsIgnoreCase(name)){
System.out.println("Found student ");
        }
        nod=nod.next;
    }
FacultyNode node = top2;
while(node!=null){
    Faculty faculty = node.getData();
    if(faculty.getFirstName().equalsIgnoreCase(name)||faculty.getLastName().equalsIgnoreCase(name)||faculty.getMiddleName().equalsIgnoreCase(name)){
System.out.println("Found Faculty");
    }
    node=node.next;
    }
    }
}