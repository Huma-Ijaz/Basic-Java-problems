import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        
        // Initialize an array to hold 40 responses
        int[] responses = new int[10];
        int[] ratingsCount = new int[10]; // To count the frequency of each rating (1-10)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 40 responses (ratings between 1 and 10):");

        // Read 40 responses from the user
        for (int i = 0; i < 10; i++) {
            int rating = 0;
            while (true) {
                System.out.print("Response " + (i + 1) + ": ");
                rating = scanner.nextInt();
                if (rating >= 1 && rating <= 10) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and 10.");
                }
            }
            responses[i] = rating;
            ratingsCount[rating - 1]++;
        }

        scanner.close();

        // Calculate average rating
        int sum = 0;
        for (int response : responses) {
            sum += response;
        }
        double average = (double) sum / responses.length;

        // Display the results
        System.out.println("\nSummary of Results:");
        System.out.printf("Average Rating: %.2f%n", average);
        System.out.println("Rating Frequency:");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ": " + ratingsCount[i] + " responses");
        }
    }
}


