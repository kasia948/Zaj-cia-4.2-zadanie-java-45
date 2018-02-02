import java.util.Scanner;

 public class MathQuiz {

     public boolean question1() {
         int userChoise;
         Scanner input = new Scanner(System.in);
         System.out.println("Jaki jest wynik mnożenia 3*5?");
         userChoise = input.nextInt();

         if (userChoise == 15) {
             return true;
         }
         return false;
     }

     public boolean question2(){
         int userChoise;
         Scanner input = new Scanner(System.in);
         System.out.println("Jakie jest pole kwadratu o boku 12");
         userChoise = input.nextInt();

         if (userChoise == 144) {
             return true;
         }
         return false;
     }

     public boolean question3(){
         int userChoise;
         Scanner input = new Scanner(System.in);
         System.out.println("Jaki jest pierwiastek kwadratowy z liczby 15129?");
         userChoise = input.nextInt();

         if (userChoise == 123) {
             return true;
         }
         return false;
     }

 }