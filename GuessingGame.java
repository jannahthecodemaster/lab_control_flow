public class GuessingGame {
    public static void main(String[] args) {
        int secretNumber = 30;
        int guess = 20;

            if (guess<secretNumber) {
                System.out.println("Your answer is too low");
            } else if (guess>secretNumber) {
                System.out.println("Your answer is too high");
            } else {
                System.out.println("Correct!");
            }
        }
    }

