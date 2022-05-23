import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int myNumber = (int)(Math.random()*100);
     int userNumber = 0;
     
     System.out.println("---------Input negative number to exit and find the number--------- ");
     System.out.println("Hint:  The number is between 1 to 100");

     do{ 
         System.out.println("Guess my number:  ");
         userNumber = sc.nextInt();
         
         if(userNumber == myNumber) {
             System.out.println("Yes ! ....That is the correct number ");
             break;
         }
         else if (userNumber > myNumber ) {
             System.out.println("Your number is too large ");
         }
         else {
             System.out.println("Your number is too small");
         }
        } while (userNumber >= 0);{
       System.out.print ("My number was: " + myNumber);
      }

  }
    
}
