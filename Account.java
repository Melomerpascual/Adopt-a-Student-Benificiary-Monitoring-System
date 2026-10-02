import java.util.Scanner;
class Account{
    StudentNode top;
    FacultyNode top2;
Scanner in = new Scanner (System.in);
  

void createAccount(){

System.out.println("Are you a student or teacher ");
System.out.println("[1] Student ");
System.out.println("[2] Teacher ?");
int input = in.nextInt();
if(input==1){
System.out.println("Enter your first name : ");
    String firstname = in.next();
    System.out.println("Enter your last name : ");
    String lastname = in.next();
    System.out.println("Enter your middle name : ");
    String middlename=in.next();
    System.out.println("Username : ");
    String username = in.next();
    System.out.println("Password : ");
    String password = in.next();

    System.out.println("Enter your age : ");
    int age= in .nextInt();
    System.out.println("Enter your contact number : ");
    int contactnumber = in.nextInt();
    System.out.println("College");
    String college = in.next();
    System.out.println("Program ");
    String program = in.next();
    System.out.println("Section");
    String section = in.next();
    System.out.println("Year");
    String year = in.next();

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
System.out.println("Enter your first name : ");
    String firstname = in.next();
    System.out.println("Enter your last name : ");
    String lastname = in.next();
    System.out.println("Enter your middle name : ");
    String middlename=in.next();
    System.out.println("Username : ");
    String username = in.next();
    System.out.println("Password : ");
    String password = in.next();

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
    while(nodes.next!=null){
nodes=nodes.next;
    }
    nodes.next=nodes;
}
}

    

}
    
boolean login(){
    

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
            return true;
        }

        nod = nod.next;
    }

    FacultyNode nodes = top2;

    while (nodes != null) {

        Faculty faculty = nodes.getData();

        if (faculty.getUsername().equals(username) &&
            faculty.getPassword().equals(password)) {

            System.out.println("This is faculty");
            return true;
        }

        nodes = nodes.next;
    }

    return false;
}



void searchAccount(String name){

}


}