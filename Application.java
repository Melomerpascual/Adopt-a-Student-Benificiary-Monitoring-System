import java.util.Scanner;
class Application{
 String status = " ";


    Scanner in = new Scanner(System.in);
void applyToFaculty(Account acc, Student student,Application apply){

    System.out.print("Enter the full name you want to be your adopter : ");
    String name = in.nextLine();

    if(name.isBlank()){
        System.out.println("Error : Please put a value");
    }else {

        if(acc.FacultyAccountChecker(name)){

            Faculty faculty = (Faculty) acc.findFacultyAccount(name);

            System.out.println("Application Succesfully");
            student.addApplications(faculty.getFirstName() + " " + faculty.getLastName());
            faculty.addApplications(student.getFirstName() + " " + student.getLastName());
           this.status="Submited";
           faculty.reciever(apply);
        }else{
            System.out.println("No account existing : " + name);
        }
    }
}



void viewApplication(Person account){
    Student stud = (Student) account;
    System.out.println("    Application   ");
    System.out.println("Status   : " + this.status);
    System.out.println("Applied to " + account.viewApplications() );
    System.out.println("Help requested : " + stud.getHelpNeed());

}
   
      


void acceptStudent(Faculty acc, Account account){
    System.out.println("Enter name : ");
    String name = in.nextLine();

    if(name.isBlank()){
        System.out.println("Error : please enter a name ");
    } else if(account.studentAccountChecker(name)){

        
        Student studs = (Student) account.findStudentAccount(name);

        String studentName = studs.getFirstName() + " " + studs.getLastName();
        String facultyName = acc.getFirstName() + " " + acc.getLastName();

        studs.addAdopters(facultyName);     // faculty goes to the student's adopters list
        acc.addAdoptedStudent(studentName); // student goes to the faculty's adoptees list
         studs.getApplication().status="accepted";
        
        System.out.println("Student successfully adopted!");
    } else {
        System.out.println("Error : Account doesnt exist");
    }
}









}