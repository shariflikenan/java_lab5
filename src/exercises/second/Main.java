package exercises.second;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int sizeOfArray = input.nextInt();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        int i=0;
        while (sizeOfArray>0 && i<sizeOfArray) {
            System.out.println("Enter number: ");
            int inputFromUser = input.nextInt();
            if (inputFromUser%2==0) evenNumbers.add(inputFromUser);
            else oddNumbers.add(inputFromUser);
            i++;
        }
        System.out.println("Even numbers: " +evenNumbers);
        System.out.println("Odd numbers: " +oddNumbers);
    }
}
