package exercises.third;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int sizeOfArray = input.nextInt();
        int numberOfEvenNumbers=0;
        int numberOfOddNumbers = 0;
        while (sizeOfArray> 0) {
            System.out.println("Enter number: ");
            int inputFromUser = input.nextInt();
            if (inputFromUser%2==0) numberOfEvenNumbers++;
            else numberOfOddNumbers++;
            sizeOfArray--;
        }
        System.out.println("number of even numbers: "+numberOfEvenNumbers);
        System.out.println("number of odd numbers: "+numberOfOddNumbers);
    }
}
