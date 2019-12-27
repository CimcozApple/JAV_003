public class Pattern_054 {
    public static void main(String[] args) {
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         *
         *
         * */
        int heightOfPyramid = 5;
        int b = 1;

        for (int i = 0; i < heightOfPyramid; i++) {
            for (int a = 0; a < b; a++) {
                System.out.print("* ");
            }

            b++;
            System.out.println();
        }

        b--;
        for (int i = 0; i < heightOfPyramid - 1; i++) {
            for (int a = b; a > 1; a--) {
                System.out.print("* ");
            }

            b--;
            System.out.println();
        }
    }
}