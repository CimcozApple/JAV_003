public class Pattern_009 {
    public static void main(String [] args) {
        /*
         * 9
         * E D C B A
         * E D C B A
         * E D C B A
         * E D C B A
         * E D C B A
         * */
        char foo2 = 69;
        char foo2End = 65;
        for (char i = foo2; i >= foo2End; i--) {
            for (char a = foo2; a >= foo2End; a--) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}