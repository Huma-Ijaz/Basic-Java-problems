import java.util.*;
import jdk.dynalink.NamedOperation;
import jdk.dynalink.Operation;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt(); 
        int Operation= sc.nextInt();
        double b = sc.nextInt();
        switch(Operation) {
            case 1: System.out.print(a+b);
            break;
            case 2: System.out.print(a-b);
            break;
            case 3: System.out.print( a*b);
            break;
            case 4: System.out.print(a%b);
            break;
            default: System.out.println("Not possible");
        }
    }
    
}
