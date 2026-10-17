import java.util.InputMismatchException;
import java.util.Scanner;
public class Main{

public static void main (String[] args){
//Account object    
Account acc = new Account();

Scanner input = new Scanner (System.in);

int choose = 100;

 while(true){
    try{
do {

    System.out.println("__________________");
    System.out.println("    EduNet care   ");
    System.out.println("[1] Create account");
    System.out.println("[2] Login");
    System.out.println("___________________");
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

        System.out.println("[1] Exit "+"\n"+ "[2] View your account"+"\n"+"[3] Search "+"\n"+"[4] Apply to faculty "+ "\n" + "[5] Change information"+"\n" +"[6] View my applications "+"\n"+"[7] View Applicants"+"\n"+ "[8] Accept" );
        System.out.print("Enter your choice :");
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
               if(student.getHelpNeed()==null){
                    System.out.println("Please provide the help you need to apply");
               }else if(student.viewApplications()==null&&student.getAdopters()==null){
                student.apply(acc);
               }else if(student.viewApplications()!=null||student.getAdopters()!=null){
                     System.out.println("Error you can only apply one at a time");
               }
           

            }else if (choice==5){
                System.out.println("What information do you want to change ?"+"\n"+"[1] Change college"+"\n"+ "[2] Change program "+"\n"+"[3] Change section"+"\n"+"[4] Change username"+"\n"+"[5] Change password "+"\n"+"[6] Contactnumber"+"\n"+"[7] Set help need");
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

               }else if (in==7){
                student.setHelpNeed();
               }
            }else if (choice == 6){
              System.out.println(student.getApplication());  
            }else if(choice == 7 ){
                System.out.println( user.getApplicant());  
            }else if (choice == 8){
              student.accept(acc);
            }
        }


































        
    }else if(user instanceof Faculty){
        Faculty faculty = (Faculty)user;
        while (choice != 1 ){
            System.out.println("What information do you want to change ?"+"\n"+"[1] Change college"+"\n"+ "[2] Change program "+"\n"+"[3] Change section"+"\n"+"[4] Change username"+"\n"+" [5]change password "+"\n"+"[6] contactnumber"+"\n"+"[7]Set help need");
            System.out.print("Enter your choice :");
             choice = input.nextInt();
             if(choice==1){
               break;
             }else if (choice == 2){
                faculty.viewInfo();
             }else if (choice == 3 ){
                System.out.println("Enter name");
                String name = input.nextLine();
                acc.searchAccount(name) ;
            }else if(choice == 4){
               faculty.apply(acc); 
             }else if(choice == 5){
              System.out.println("Please choose  what you want to change [1]change username"+"\n"+ "[2]change password " +"\n"+"[3] College" );
              int ch = input.nextInt();
              if(ch == 1){
              user.changeUsername();
              }else if (ch == 2){
               user.changePassword();
              }else if(ch == 3){
              faculty.changeCollege();
             } }else if(choice == 6){
             System.out.println(user.viewApplications());  
              }else if (choice == 7){
                  System.out.println(user.getApplicant());

              }else if (choice == 8){

              }
    }
}else{
        System.out.println("Login failed ");
    }
        }
    

}while(choose!=0);


    }catch(InputMismatchException e){
     System.out.println("Error : Invalid input please enter a number");
     String in = input.nextLine();
    }


 }



}
}