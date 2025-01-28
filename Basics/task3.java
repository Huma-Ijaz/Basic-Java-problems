import java.util.*;
public class task3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        final int a = 11;
        final double RATE = 12.50;
        int num1, num2, newNum;
        String name;
        double wages , hoursWorked;
        System.out.println("Enter 1st Integer");
        num1 = sc.nextInt();
        System.out.println("Enter 2nd Integer");
        num2 = sc.nextInt();
        System.out.println("Number 1 is =" +num1+"Number 2 is " +num2);
        newNum = (num1 * 2) +num2;
        System.out.println("newNum value is :" +newNum);
        System.out.println("Enter first name:");
        name = sc.next();
        System.out.println("Enter Value between 0 to 70:");
        hoursWorked = sc.nextDouble();
        System.out.println("calculate wages:");
        wages = RATE*hoursWorked;
        System.out.println("Name=" +name);
        System.out.println("Pay Rate= $" + RATE);
        System.out.println("Hours Worked =" +hoursWorked);
        System.out.println("Salary = $" +wages);




        
    }
    
}
