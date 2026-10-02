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
    int choice =input.nextInt();
    if(acc.login()){
        while(choice!=3){
            System.out.println("Enter your choice [1] Search ,[2],[3]Exit");
            choice = input.nextInt();
            if(choice==1){
              System.out.println("Enter Name");
              String name = input.next();
              acc.searchAccount(name);
            }else if (choice==2){

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