import java.net.SocketTimeoutException;
import java.util.Scanner;
public class Main{


public static void main (String[] args){
    Account acc = new Account();
Scanner input = new Scanner (System.in);
int choose = 100;
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
    if(user!=null){
    System.out.println("Enter your choice [1] Search ,[2]View your Account, [3] Exit , [4]apply ");
    int choice=input.nextInt();
        while(choice!=3){
            System.out.println("Enter your choice [1] Search ,[2]view your account ,[3]Exit ,[4] apply , ");
             choice = input.nextInt();
            if(choice==1){
                input.nextLine();
              System.out.println("Enter Name");
              String name = input.nextLine();
              acc.searchAccount(name);
            }else if (choice==2){
              user.viewInfo();
            }else if (choice==3){
break;
            }else if (choice ==4){
                input.nextLine();
user.apply();
            }
        }
System.out.println("Login succesfully");
    }else{
        System.out.println("Failed");
    }







}
    }while(choose!=0);

}

}