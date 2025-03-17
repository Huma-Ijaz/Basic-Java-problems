import java.util.Scanner;

public class Practice {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of a = ");
        int a = sc.nextInt();
        boolean isprime = false ;

        for(int i = a ; i<20 ; i++){
            if(a/i==1){
                isprime = true ;
                break;
            }
            System.out.print(isprime ? "is prime number" : "is not prime number ");
//            for(int j = 4 ; j >= i ; j--){
//
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }

    }
}
}
