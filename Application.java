import java.util.Scanner;
class Application{
Scanner in = new Scanner(System.in);






void apply(Account acc,Student user){
try {
    System.out.print("Enter Faculty name :");
    String name = in.nextLine();

      if (name.isBlank()){
      System.out.println("Please put a value ");

      }else if(acc.facultyAccountChecker(name)&&!name.equalsIgnoreCase(user.getFirstName())&&!name.equalsIgnoreCase(user.getLastName())&&!name.equalsIgnoreCase(user.getMiddleName())){
      
        Faculty faculty =acc.findFacultyAccount(name);
      faculty.addApplicant(user.getFirstName()+" "+user.getLastName());
      user.setApplication(faculty.getFirstName()+" "+faculty.getLastName());
      user.setApplicationStatus("Pending");
      System.out.println("Application sent");
      }else{
      System.out.println("Error : Faculty not found");
      }
} catch (NullPointerException e) {
            System.out.println("Error : No account Existing yet");
        }
    }


public void finishAdoption(Account acc,Faculty faculty){
if(faculty.getAdoptedStudent().isBlank()){
System.out.println("Error : You dont have an adopted student yet");
return;
}
Student student = acc.findStudentAccount(faculty.getAdoptedStudent());
if(student!=null){
student.setAdopters("");
student.setApplicationStatus("");
student.setApplication("");
}
faculty.setAdoptedStudent("");
System.out.println("Adoption finished");

}

public void accept(Account acc,Faculty user){
try{
System.out.println("Enter name :");
String name = in.nextLine();
Student account = acc.findStudentAccount(name);
if(account!=null&&acc.studentAccountChecker(name)&&account.getApplication().equals(user.getFirstName()+" "+user.getLastName())){
    

    user.removeApplicant(account.getFirstName() + " " + account.getLastName() );
   user. setAdoptedStudent(account.getFirstName()+" "+account.getLastName());

    
  // user.removeApplication(user.getFirstName()+""+user.getLastName());
   
    account.setAdopters(user.getFirstName()+" " + user.getLastName());
    account.setApplicationStatus("Accepted");
System.out.println("Accepted Successfully ");
}else if(acc.facultyAccountChecker(name)){
System.out.println("Error");
}else{
System.out.println("Error : No student with that name applied to you");
}
}catch(NullPointerException e){
System.out.println("Error theres no account existing yet");
}


}

}