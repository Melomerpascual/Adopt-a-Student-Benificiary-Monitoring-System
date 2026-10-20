import java.util.Scanner;
interface Application{

    Scanner in = new Scanner(System.in);
 void apply(Account acc);
      

 void accept(Account acc);

 void viewApplication();

default void cancelApplication(){

}


void finishAdoption();





}