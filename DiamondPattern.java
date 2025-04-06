public class DiamondPattern {
    public static void main(String[]args){
        for(int i = 1; i<=5 ;i++){
            for (int k = 5; k >=i ; k--) {
                System.out.print(" ");

            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }System.out.println();
        }


        for(int i = 5; i>=1 ;i--){
            for (int k = 5; k>=i ; k--) {
                System.out.print(" ");

            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }System.out.println();
        }

//        int i, j, k;
//
//        // Upper half of the diamond
//        for (i = 1; i <= 5; i++) {
//            for (k =5; k>= i; k--) {
//                System.out.print(" "); // Print spaces to center the numbers
//            }
//            for (j = 1; j <= i; j++) {
//                System.out.print("* "); // Print stars (or numbers if you prefer)
//            }
//            System.out.println(); // Move to the next line after the row is complete
//        }
//
//        // Lower half of the diamond
//        for (i = 5; i >=1; i--) {
//            for (k = 1 ; k>=i; k--) {
//                System.out.print(" "); // Print spaces to center the numbers
//            }
//            for (j = 1; j <= i; j++) {
//                System.out.print("* "); // Print stars (or numbers if you prefer)
//            }
//            System.out.println(); // Move to the next line after the row is complete
//        }


    }
}
