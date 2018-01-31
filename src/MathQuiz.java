import java.util.Scanner;

 public class MathQuiz {

      static boolean question1() {
         Scanner input = new Scanner(System.in);
         int userChoise = input.nextInt();

         if (userChoise != 15) {
             System.out.println("Nieprawidłowy wynik");
             System.out.println("Podaj inną wartość");
             userChoise = input.nextInt();
         }else {
             System.out.println("Prawidłowy wynik");
             input.close();
         }
        return true;
     }
 }