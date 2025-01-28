import java.util.*;
public class Activity3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String firstname;
        String lastname;
        int age;
        double weight;
        System.out.println("firstname, lastname," + "age, and weight,"+ "by spaces");
        firstname = sc.next();
        lastname = sc.next();
        age = sc.nextInt();
        weight = sc.nextDouble();
        System.out.println("Name: " +firstname +" " +lastname);
        System.out.println("Age: " +age);
        System.out.println("Weight: "+weight);
     }
    
}
