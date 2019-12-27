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
         * change 'heightOfPyramid' variable from 1 to infinity
         * */
        int heightOfPyramidFromRightToLeft = 5;
        int startPoint = 1;

        for (int i = 0; i < heightOfPyramidFromRightToLeft; i++) {
            for (int a = 0; a < startPoint; a++) {
                System.out.print("* ");
            }

            startPoint++;
            System.out.println();
        }

        startPoint--;
        for (int i = 0; i < heightOfPyramidFromRightToLeft - 1; i++) {
            for (int a = startPoint; a > 1; a--) {
                System.out.print("* ");
            }

            startPoint--;
            System.out.println();
        }
    }
}