public class Pattern_055 {
    public static void main(String[] args) {
        /*
        * 55
        * 4
        * 4 3
        * 4 3 2
        * 4 3 2 1
        * 4 3 2 1 0
        * 4 3 2 1
        * 4 3 2
        * 4 3
        * 4
        * change only 'heightOfPyramid' value of var from 1 up to infinity number
        * */
        int heightOfPyramid = 5;
        int digitToFirstBlock = heightOfPyramid - heightOfPyramid + 1;
        int digitToSecondBlock = heightOfPyramid;
        int conditionToFirstBlock = 2;
        int digitToConsole;

        for (int i = 0; i < heightOfPyramid; i++) {
            digitToConsole = heightOfPyramid - 1;

            for (int a = digitToFirstBlock; a < conditionToFirstBlock; a++) {
                System.out.print(digitToConsole + " ");
                digitToConsole--;
            }

            conditionToFirstBlock++;
            System.out.println();
        }

        for (int i = 0; i < heightOfPyramid - 1; i++) {
            digitToConsole = heightOfPyramid - 1;

            for (int a = digitToFirstBlock; a < digitToSecondBlock; a++) {
                System.out.print(digitToConsole + " ");
                digitToConsole--;
            }

            digitToSecondBlock--;
            System.out.println();
        }
    }
}