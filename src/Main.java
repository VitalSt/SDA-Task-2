public class Main {
    public static void main(String[] args) {
        int userDigit = 5;
        // User digit in range 0-9
        if (userDigit >= 0 && userDigit <= 9 && userDigit != 3 && userDigit != 5) {
            System.out.println("Nice, digit in range 0-9");
        }
        // User digit not in range 0-9
        else {
            if (userDigit < 0 || userDigit > 9) {
                System.out.println("Error, digit not in range 0-9");
            }
            else {
                if (userDigit == 3 || userDigit == 5) {
                    System.out.println("Congrats, lucky digit!");
                }
            }
        }
    }
}