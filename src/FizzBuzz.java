import java.util.*;

public class FizzBuzz {
    private static int getUserValue() {
        System.out.print("INPUT YOUR NUMBER: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    /*
     * FizzBuzz (Option 1)
     * Если юзер вводит число 3, 6, 9, 12... отобразить Fizz,
     * если 5, 10... отобразить Buzz и
     * если 15, 30, 45... отобразить FizzBuzz
     * */
    private static void fizzBuzz1(final int userValue) {
        int fizz = 3;
        int buzz = 5;
        int fizzBuzz = fizz * buzz;
        int zero = 0;

        if (userValue % fizzBuzz == zero) {
            System.out.println("FizzBuzz");
        } else if (userValue % fizz == zero) {
            System.out.println("Fizz");
        } else if (userValue % buzz == zero) {
            System.out.println("Buzz");
        } else {
            System.out.println(userValue);
        }
    }

    /*
     * FizzBuzz (Option 2)
     * */
    private static void fizzBuzz2(final int rangeOfUserValues) {
        int fizz = 3;
        int buzz = 5;
        int fizzBuzz = fizz * buzz;
        int zero = 0;
        int[] arrayOfUserValues = new int[rangeOfUserValues];

        for (int i = 0, a = 1; i < rangeOfUserValues; i++, a++) {
            arrayOfUserValues[i] = a;
        }

        for (int i = 0; i < rangeOfUserValues; i++) {
            if (arrayOfUserValues[i] % fizzBuzz == zero) {
                System.out.println("FizzBuzz");
            } else if (arrayOfUserValues[i] % fizz == zero) {
                System.out.println("Fizz");
            } else if (arrayOfUserValues[i] % buzz == zero) {
                System.out.println("Buzz");
            } else {
                System.out.println(arrayOfUserValues[i]);
            }
        }
    }

    public static void main(String[] args) {
        fizzBuzz1(getUserValue());
        System.out.println("#################################################################################");
        fizzBuzz2(getUserValue());
    }
}