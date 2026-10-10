import java.util.InputMismatchException;
import java.util.Scanner;
public class Main{

public static void main (String[] args){
//Account object    
Account acc = new Account();
//Scanner object with and the input name
Scanner input = new Scanner (System.in);

int choose = 100;

 while(true){
    try{
do {

    System.out.println("__________________");
    System.out.println("    EduNet care   ");
    System.out.println("[1] Create account");
    System.out.println("[2] Login");
    System.out.println("__________________");
    choose=input.nextInt();    
   
switch (choose){

   case 1:
    acc.createAccount();
    break;

  case 2 :
   Person user = acc.login(); 
  
   int choice=0;
    if(user instanceof Student){
        Student student = (Student) user;
        while(choice!=1){
            System.out.println("[1] Exit "+"\n"+ "[2]VIew your account"+"\n"+"[3]Search "+"\n"+"[4] apply to faculty "+ "\n" + "[5]Change my information"+"\n" +"[6]View my applications " + "[7] My applicatin status" );
            System.out.print("Enter your choice : ");
             choice = input.nextInt();
           
            if(choice==1){
               break;
            }else if (choice==2){
              user.viewInfo();
            }else if (choice==3){
             input.nextLine();
             System.out.print("Enter Name :");
             String name = input.nextLine();
             System.out.print(acc.searchAccount(name)); 
            }else if (choice ==4){
                input.nextLine();
               Application apply = new Application();
                apply.applyToFaculty(acc,student);
            }else if (choice==5){
                System.out.println("What information do you want to change ? [1]change college [2]change program [3]change section [4]change username [5]change password ,[6] contactnumber");
                int in = input.nextInt();
               if(in == 1){
              
                      student.changeCollege();
               }else if (in == 2){
                     student.changeProgram();
               }else if (in == 3){
                       student.changeSection();
               }else if (in == 4){
                user.changeUsername();
               }else if(in == 5){
                  user.changePassword();
               }else if (in == 6){
                   user.changeContactNumber();

               }
            }else if (choice == 6){
               
            }
        }

    }else if(user instanceof Faculty){
        Faculty faculty = (Faculty)user;
        while (choice != 1 ){
             System.out.println("[1]Exit "+"\n"+ "[2]view your account"+"\n"+"[3]Search "+"\n"  + "[4]Accept"+"\n"+"[5]Change information" +"\n"+"[6]Applications");
            System.out.print("Enter your choice : ");
             choice = input.nextInt();
             if(choice==1){

             }else if (choice == 2){

             }else if (choice == 3 ){
                
             }else if(choice == 4){
              
             }else if(choice == 5){
              System.out.println("Please choose  what you want to change [1]change username [2]change password " );
              int ch = input.nextInt();
              if(ch == 1){
              user.changeUsername();
              }else if (ch == 2){
               user.changePassword();
              }else if(ch ==3){

             

             } }else if(choice == 6){
             System.out.println(user.viewApplications());  
              }else if (choice==7){
    Application apply = new Application();
    apply.acceptStudent(faculty,acc );
              }
    }
}else{
        System.out.println("Login failed ");
    }
        }
      

}while(choose!=0);


    }catch(InputMismatchException e){
     System.out.println("Error : Invalid input please enter a number");
    }


 }



}
}