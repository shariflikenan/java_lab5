package exercises.fourth;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int sizeOfArray = input.nextInt();
        int[] arrayOfNumbers = new int[sizeOfArray];
        int i=0;
        while (sizeOfArray>0 && i<sizeOfArray) {
            System.out.println("Enter number: ");
            arrayOfNumbers[i] = input.nextInt();
            i++;
        }
        System.out.println("Even numbers with indexes >> ");
        for (int j = 0; j < sizeOfArray; j++) {
            if (arrayOfNumbers[j]%2==0) {
                System.out.println(arrayOfNumbers[j]+">"+j);
            }
        }
        System.out.println("Odd numbers with indexes >> ");
        for (int j = 0; j < sizeOfArray; j++) {
            if (arrayOfNumbers[j]%2!=0) {
                System.out.println(arrayOfNumbers[j]+">"+j);
            }
        }
    }
}
