import java.util.InputMismatchException;
import java.util.Scanner;
public class Main{

public static void main (String[] args){
//Account object    
Account acc = new Account();
Application apply = new Application();
Scanner input = new Scanner (System.in);

int choose;

 while(true){
try{
  do {
    System.out.println("""     
      __________________
      ****EduNet care****
      [1] Create a account
      [2] Login
      ___________________
      """);
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
      System.out.println("""
        ----STUDENT DASHBOARD----
        [1] Exit
        [2] View your account
        [3] Search
        [4] Apply to faculty
        [5] Change information
        [6] View my application
        [7] Remove help need
        [8] Create help need
        --------------------------""");
      System.out.print("Enter your choice :");
      choice = readNumber(input);
  
      switch (choice){
       case 1 :
        break; 

       case 2:
        user.viewInfo();
         break;

       case 3:
       input.findWithinHorizon("\r?\n", 0);
       System.out.print("Enter Name :");
       String name = input.nextLine();
       acc.searchAccount(name);
         break;

       case 4 :
       input.findWithinHorizon("\r?\n", 0);
      
             if (student.getHelpNeed().isBlank()) {
           System.out.println("Error : Cannot Apply without putting help need first");
            break;
       }else{
         apply.apply(acc, student);
       }
       
       break;
    

       case 5 : 
       input.findWithinHorizon("\r?\n", 0);
        int in =0;
        while(in!=9){
         System.out.print("""
          What information do you want to change ? 
          [1] Change college
          [2] Change program  
          [3] Change section 
          [4] Change password 
          [5] Contactnumber 
          [6] Change First Name
          [7] Change Last Name
          [8] Change Middle Name
          [9] Exit  """);

         in = readNumber(input);
         switch (in){
         
          case 1 : 
          student.changeCollege();
           break;

          case 2 :
           student.changeProgram();
           break;

          case 3 :
            student.changeSection();
           break;

          case 4 :
          user.changePassword();
          break;

          case 5 :
          user.changeContactNumber();
          break;

          case 6:
          user.changeFirstName();
          break;
          
          case 7:
          user.changeLastName();
          break;

          case 8 :
          user.changeMiddlename();
          break;
          
          

            }                    
}break;
       case 6 :
       if(student.getApplicationStatus().isBlank()){
        System.out.println("You dont have any application yet");
        }else{
         student.viewApplication(); 
             }
        break;
             
       case 7 :
        student.removeHelpNeed();
        break;

       case 8:
        student.setHelpNeed();
          break;

                }
                }
}else if(user instanceof Faculty){
  Faculty faculty = (Faculty)user;    
while (choice!=1) { 
    System.out.println("""
  [1] Exit
  [2] View your account
  [3] Search
  [4] Change information 
  [5] View Applicants
  [6] Accept
  [7] Finish Adoption""" );
  choice = readNumber(input);
 
  switch (choice){
     
   case 1 :
   break;
              
   case 2:
   faculty.viewInfo();
   break;

   case 3 :
   input.findWithinHorizon("\r?\n", 0);
   System.out.println("Enter name");
   String name = input.nextLine();
   acc.searchAccount(name) ;
   break;

   case 4 :
   int ch = 0;
   
   while(ch!=4){ 
   
   System.out.println("""
    Please choose  what you want to change 
    [1]change password 
    [2] Contactnumber
    [3] College
    [4] Exit
    [5]Change First Name
    [6] Change Last Name
    [7] Change Middle Name""" );
   ch = readNumber(input);
   
   switch (ch){
   case 1 :
   user.changePassword(); 
   break;

   case 2 :
  user.changeContactNumber();
   break;

   case 3:
    faculty.changeCollege();
  break;
           
   case 4 :
   break;

   case 5 :
   user.changeFirstName();
   break;

   case 6 :
   user.changeLastName();
   break;

   case 7 :
   user.changeMiddlename();
   break;
}
   
        }
   break;

   case 5 :
   System.out.println(faculty.getApplicant() );   
   break;

   case 6 :   
   apply.accept(acc, faculty); 
   break;

   case 7 :
   apply.finishAdoption(acc, faculty);
   break;

   

      }
                } 
  }
  else{
       System.out.println("Login failed ");
  }
}
 
  }while(choose!=0);

    }catch(InputMismatchException e){
     System.out.println("Error : Invalid input please enter a number");
     input.findWithinHorizon("\r?\n", 0);
    }
  }
}

// reads a number inside the menus; a wrong input does not log the user out
static int readNumber(Scanner input){
  try{
    return input.nextInt();
  }catch(InputMismatchException e){
    System.out.println("Error : Invalid input please enter a number");
    input.findWithinHorizon("\r?\n", 0);
    return -1;
  }
}
}