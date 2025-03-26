import java.util.Scanner;

public class subjectswithmarks {
    public static void main(String[]args){
        String[] sub = {"English", "Urdu ", "pf"};
        int [] marks = {98,97,100};

        for (int i = 0 ; i < 3 ; i ++){
            System.out.println(sub[i] + "=" + marks[i]);
        }
    }
}
