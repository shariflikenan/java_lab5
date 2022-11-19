package exercises.first;

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
        for (int j=0;j<sizeOfArray;j++) {
            int key= arrayOfNumbers[j];
            int k = j-1;
            while (k>=0 && key < arrayOfNumbers[k]){
                arrayOfNumbers[k+1] = arrayOfNumbers[k];
                --k;
            }
            arrayOfNumbers[k+1] = key;
        }
        for (int value: arrayOfNumbers) {
            System.out.println(value);
        }
    }
}