//public class Pattern_054 {
//    public static void main(String[] args) {
//        /*
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
//        *
//        * 1, 3, 5, 7...
//        * */
//        int heightOfPyramid = 3;
//        int b = 1;
//
//        for (int i = 0; i < heightOfPyramid; i++) {
//            for (int a = 0; a < b; a++) {
//                System.out.print("* ");
//            }
//
//            b++;
//            System.out.println();
//
//            for (int c = 3 - 1; c == b; c--) {
//                System.out.print("* ");
//            }
//
//            b--;
//            System.out.println();
//        }
//    }
//}

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
         * 1, 2, 3...
         * */
        int heightOfPyramid = 3;
        int strong = heightOfPyramid * 2 - 1;
        int b = 1;

        for (int i = 0; i < strong; i++) {
            for (int a = 0; a < b; a++) {
                System.out.print("* ");
            }

            b++;
//            System.out.println();

            for (int c = 0; c < b; c++) {
                System.out.println();
                System.out.print("* ");
                b--;
            }

            System.out.println();
        }
    }
}