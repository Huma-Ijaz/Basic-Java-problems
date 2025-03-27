import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
//        int a[][] = {{1, 2}, {3, 4}};
//        int b[][] = {{5, 6}, {7, 8}};
//        int c[][] = new int[2][2];
//
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];
//            }
//
//            for (int i = 0 ; i < 2; i++) {
//                for (int j = 0; j < 2; j++) {
//                    System.out.print(c[i][j] + " ");
//
//                } System.out.println();






            //ForSum


//        for (int i=0; i<2; i++)
//        {
//            for(int j=0; j<2; j++)
//            {
//                c[i][j] = a [i][j] + b [i][j];
//            }
//        }
//
//        for(int i=0; i<2; i++)
//        {
//            for(int j=0; j<2; j++)
//            {
//                System.out.print(c[i][j] + " ");
//            }
//
//            System.out.println();
//        }




                 Scanner  scanner= new Scanner(System.in);

                // Input from the user
                System.out.print("Enter the number of terms for the Fibonacci sequence: ");
                int n = scanner.nextInt();

                // First two terms of the Fibonacci sequence
                int a = 0, b = 1;

                System.out.println("Fibonacci sequence up to " + n + " terms:");

                // Loop to generate the Fibonacci sequence
                for (int i = 1; i <= n; i++) {
                    System.out.print(a + " ");

                    // Calculate the next term
                    int next = a + b;
                    a = b;
                    b = next;
                }
            }
        }







