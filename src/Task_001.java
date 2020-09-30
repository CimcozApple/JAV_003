import java.util.ArrayList;
import java.util.Scanner;

public class Task_001 {
    static ArrayList getDigitsFromUser() {
        int valueFromUser;
        Scanner scanner;
        ArrayList listOfDigits = new ArrayList();
        do {
            System.out.print("Input a digit (for exit input '-1'): ");
            scanner = new Scanner(System.in);
            valueFromUser = scanner.nextInt();
            if (valueFromUser == -1) {
                break;
            }
            listOfDigits.add(valueFromUser);
        } while (!(valueFromUser == -1));
        scanner.close();
        return listOfDigits;
    }

    static void getAmountOfRepeats(ArrayList arrayFromUser) {
        ArrayList arrayOfNumbers = arrayFromUser;
        int currentCounter = 0;
        int previousCounter = 0;
        int currentValue = 0;
        int previousValue = 0;
        outer:
        for (int i = 0; i < arrayOfNumbers.size(); i++) {
            currentValue = (int) arrayOfNumbers.get(i);
            if (currentCounter == 0) {
                currentCounter++;
            } else {
                if (previousCounter > currentCounter) {
                    if (currentValue == previousValue) {
                        currentCounter++;
                    } else {
                        currentCounter = 1;
                    }
                } else {
                    if (currentValue == previousValue) {
                        currentCounter++;
                    } else {
                        if (currentCounter > (arrayOfNumbers.size() - i)) {
                            break outer;
                        }
                        previousCounter = currentCounter;
                        currentCounter = 1;
                    }
                }
            }
            previousValue = currentValue;
        }
        System.out.println("Digit '" + previousValue + "' are repeated " + currentCounter + " times");
    }

    public static void main(String[] args) {
        /*
         * Найти наибольшую последовательность чисел в целочисленном наборе (в массиве)
         * Пример, задан массив {2, 2, 3, 4, 3, 5, 5, 5, 5, 5, 5, 5, 5, 8, 2, 8}
         * Нужно вывести наибольшую последовательность повторяющихся чисел в списке
         * Вывод: 8 - т. к. в массиве 5-рки повторяются 8 раз подряд
         * */
        getAmountOfRepeats(getDigitsFromUser());
    }
}