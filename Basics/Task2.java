import java.util.*;
public class Task2 {
    Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width;
        System.out.print("Enter the width :");
        width = sc.nextInt();
        System.out.println(width);
        int length;
        System.out.println("Enter the length:");
        length = sc.nextInt();
        System.out.println(length);
        double area = (length * width);
        System.out.println("Area ="+area);
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter ="+perimeter);

        

    }
    
}
