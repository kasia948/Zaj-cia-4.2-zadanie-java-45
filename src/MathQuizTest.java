public class MathQuizTest {

    public static void main(String[] args) {

        MathQuiz pyt = new MathQuiz();
        System.out.println("Odpowiedz na pierwsze pytanie");
        if (pyt.question1()){
            System.out.println("Prawidłowy wynik");
        }else {
            System.out.println("Źle");
        }

        System.out.println("Odpowiedz na drugie pytanie");
        if (pyt.question2()){
            System.out.println("Prawidłowy wynik");
        }else {
            System.out.println("Źle");
        }

        System.out.println("Odpowiedz na trzecie pytanie");
        if (pyt.question3()){
            System.out.println("Prawidłowy wynik");
        }else {
            System.out.println("Źle");
        }
    }
}