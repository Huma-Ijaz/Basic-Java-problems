

public class Q2 {
    public static void main(String[] args) {
        float C1 , C2, C3 ;  //C1 = Course 1
        int CreditC1, CreditC2, CreditC3; // CreditC1 = Credithours of C1
        float CGPA = 0.0f;
        float gradepoints = 0.0f;
    C1 = 3.5f ; C2 = 3.8f ; C3 = 4f;
    CreditC1 = 4 ; CreditC2 = 3 ; CreditC3 = 2;
    gradepoints = ((C1 * CreditC1) + (C2 * CreditC2) + (C3 *CreditC3 ));
    int totalcredits = (CreditC1 + CreditC2 + CreditC3);
    CGPA =  gradepoints/totalcredits ;
    System.out.println("CGPA of Given Courses = ");
    System.out.println(CGPA);


    }
    
}
