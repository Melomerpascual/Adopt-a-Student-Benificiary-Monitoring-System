import java.util.Scanner;
class Faculty extends Person{
    String college;
    String adoptees;
    String offer;
    Scanner in = new Scanner(System.in);

    
   Faculty(String lastname,String firstname,String middlename,String username,String password,int age,int contactnumber){
super(lastname,firstname,middlename,username,password,age,contactnumber);
   
   } 

void accept(){
    System.out.println("Enter name : ");
    String name = in.nextLine();
    this.adoptees+=name;
}


void viewInfo(){
    super.viewInfo();
    System.out.println("College : " + this.college);
    System.out.println("Adoptee : " + this.adoptees);
    
}


}