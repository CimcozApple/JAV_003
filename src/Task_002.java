public class Task_002 {
    static String concatStrings(String a, String b) {
        return a.concat(b);
    }

    static void deleteChar(String deletedChar, char targetLetter) {
        int amountOfLettersShouldBeDeleted = countDeletedLetters(deletedChar, targetLetter);
        char[] finalArray = new char[deletedChar.length() - amountOfLettersShouldBeDeleted];
        int count = 0;
        for (int i = 0; i < deletedChar.length(); i++) {
            if (!(deletedChar.charAt(i) == targetLetter)) {
                finalArray[count] = deletedChar.charAt(i);
                count++;
            }
        }
        System.out.println("Final text is '" + new String(finalArray) + "'");
    }

    private static int countDeletedLetters(String textForCounter, char targetLetter) {
        int counter = 0;
        char[] arrayOfChars = textForCounter.toCharArray();
        for (int i = 0; i < textForCounter.length(); i++) {
            if (arrayOfChars[i] == targetLetter) {
                counter++;
            }
        }
        System.out.println("Text has " + counter + " '" + targetLetter + "' " + "letter/s");
        return counter;
    }

    public static void main(String[] args) {
        /*
         * 1 - concatenate two strings
         * 2 - delete letter 'P' from final text
         * Should be "H Exercises and ython Exercises" text
         * */
        String a = "PHP Exercises and ";
        String b = "Python Exercises";
        char targetLetter = 'P';
        deleteChar(concatStrings(a, b), targetLetter);
    }
}