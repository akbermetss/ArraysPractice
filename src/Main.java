import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- 1 TASK ---");
        int[] array1 = {-13, 0, -97, 88, -11, 0, 12, -1, 67, 2};

        int positive = 0;
        int negative = 0;
        int zero = 0;

        System.out.print("Array: ");

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
            if (array1[i] > 0) {
                positive++;
            } else if (array1[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println();
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);

        System.out.println("");
        System.out.println("--- 2 TASK ---");

        int[] array2 = {223, 13, 208, 320, 199, 777, 9, 196};

        int largest = array2[0];
        int smallest = array2[0];
        int largestIndex = 0;
        int smallestIndex = 0;

        for (int i = 1; i < array2.length; i++) {
            if (array2[i] > largest) {
                largest = array2[i];
                largestIndex = i;
            }
            if (array2[i] < smallest) {
                smallest = array2[i];
                smallestIndex = i;
            }
        }
        System.out.print("Array: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        System.out.println("Largest: " + largest + " at index " + largestIndex);
        System.out.println("Smallest: " + smallest + " at index " + smallestIndex);

        System.out.println("");
        System.out.println("--- 3 TASK ---");

        int[] array3 = {45, 57, 7, 111, 53, 66};
        int sum = 0;
        for (int i = 0; i < array3.length; i++) {
            sum += array3[i];
        }

        double average = (double) sum / array3.length;
        int count = 0;
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] > average) {
                count++;
            }
        }

        System.out.print("Array: ");

        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }

        System.out.println();
        System.out.println("Average: " + average);
        System.out.println("Numbers above average: " + count);

        System.out.println("");
        System.out.println("--- 4 TASK ---");

        int[] array4 = {7, 9, 8, 6, 0, 25, 67};
        System.out.print("Original array: ");
        for (int i = 0; i < array4.length; i++) {
            System.out.print(array4[i] + " ");
        }
        System.out.println();
        System.out.print("Reversed array: ");
        for (int i = array4.length - 1; i >= 0; i--) {
            System.out.print(array4[i] + " ");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("--- 5 TASK ---");

        int[] scores = new int[5];
        int passed = 0;
        int failed = 0;
        int sumOfScores = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            int score = input.nextInt();
            while (score < 0 || score > 100) {
                System.out.println("Invalid score! Enter a score between 0 and 100.");
                System.out.print("Enter score " + (i + 1) + ": ");
                score = input.nextInt();
            }
            scores[i] = score;
            sumOfScores += scores[i];
            if (scores[i] >= 60) {
                passed++;
            } else {
                failed++;
            }
        }

        double averageScore = (double) sumOfScores / scores.length;

        System.out.print("Scores: ");

        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }

        System.out.println();
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Average: " + averageScore);

        input.close();
    }
}