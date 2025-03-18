public class min_maxvalues {
    public static void main(String[]args){
        int num[] = {87,78,67,56,98,34,56,78,99};
        //int min = num[0];
        int max = num[0];


        //for output
        for (int i = 0 ; i<9 ; i++){
           // if (num[i]< min){
             //   min = num[i];
            if (num[i]>max){
                max = num[i];
            }
        }
        //System.out.print("Minimum value is:"+ min);
        System.out.print("Maximum Value in Array is:" + max);
    }
}
