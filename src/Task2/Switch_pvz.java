package Task2;

import java.util.Scanner;

public class Switch_pvz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digit from range 0-9:");
        int userDigit = scanner.nextInt();

        switch(userDigit){
            case 0:
            case 1:
            case 2:
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("Nice, digit in range 0-9");
                break;
            case 3:
            case 5:
                System.out.println("Congrats, lucky digit!");
                break;
            default:
                System.out.println("Error, digit not in range 0-9");
                break;
        }
    }
}