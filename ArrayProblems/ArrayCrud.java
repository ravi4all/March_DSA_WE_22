package ArrayProblems;

import java.util.Scanner;

public class ArrayCrud {

    int arr[];
    int currentSize;

    ArrayCrud(int capacity) {
        arr = new int[capacity];
        currentSize = 0;
    }
    
    void insert(int index, int value) {
        if(arr.length == currentSize) {
            System.out.println("Array is full...");
        }

        if(index > currentSize) {
            throw new RuntimeException("Position cannot be greater than current size");
        }

        for(int i = currentSize - 1; i >= index; i--) {
            arr[i+1] = arr[i];
        }

        arr[index] = value;
        currentSize++;
        System.out.println("Element Added...");
        print(arr);
    }

    void print(int []arr) {
        for(int elem : arr) {
            System.out.println(elem);
        }
    }

    public static void main(String[] args) {
        ArrayCrud obj = new ArrayCrud(5);
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("1. Insertion Operation");
            System.out.println("2. Deletion Operation");
            System.out.println("3. Updation Operation");
            System.out.println("4. Searching Operation");
            System.out.println("5. Printing Operation");

            System.out.print("Enter your choice : ");
            int ch = scanner.nextInt();
            ArrayOperations enumChoice = ArrayOperations.values()[ch - 1];
            switch(enumChoice) {
                case INSERT:
                    System.out.print("Enter the index : ");
                    int index = scanner.nextInt();
                    System.out.print("Enter the value : ");
                    int value = scanner.nextInt();
                    obj.insert(index, value);
                    break;
                case DELETE:
                    break;
                case EXIT:
                    return;
                default:
                    System.out.println("Wrong choice...");
            }
        }
    }

}

enum ArrayOperations {
    INSERT, DELETE, SEARCH, PRINT, UPDATE, EXIT
}