import java.util.Scanner;

class Application{
    private String status =" ";

    Scanner in = new Scanner(System.in);
void applyToFaculty(Account acc, Student student){

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
           
        }else{
            System.out.println("No account existing : " + name);
        }
    }
}





String statusChecker(){
    return this.status;
}
    
    


void acceptStudent(Faculty acc, Account account){
    System.out.println("Enter name : ");
    String name = in.nextLine();

    if(name.isBlank()){
        System.out.println("Error : please enter a name ");
    } else if(account.studentAccountChecker(name)){

        // the REAL student from the account
        Student studs = (Student) account.findStudentAccount(name);

        String studentName = studs.getFirstName() + " " + studs.getLastName();
        String facultyName = acc.getFirstName() + " " + acc.getLastName();

        studs.addAdopters(facultyName);     // faculty goes to the student's adopters list
        acc.addAdoptedStudent(studentName); // student goes to the faculty's adoptees list

        System.out.println("Student successfully adopted!");
    } else {
        System.out.println("Error : Account doesnt exist");
    }
}









}