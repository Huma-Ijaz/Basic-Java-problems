public class sumofArrays {
    public static void main(String[]args){
        int arr [] = { 34, 56 , 79,98,97};
        int sum = 0;
        double average=0;

        //For reverse of arrays
//        for (int i=4; i >= 0; i--){
//            System.out.println("Reverse of Array is:"+ arr[i]);
//
//        }

            //for sum and Average of Array
            for(int i = 0; i < 5 ; i++){
            sum = sum + arr[i];
            average = sum/arr.length;
        }

            average = sum/arr.length;
        System.out.println ("Sum of Array is:" + sum);
        System.out.print("Average of Array is:" + average);

    }
}
