package mustafakhan.uk.to.dsa.dataStructures.arrays;

import java.util.Scanner;

public class ArraysUtilities {
    public Integer DoOPerations(int choice, int index, int element, ArraysOperations arraysOperations) {
        switch (choice) {
            case 1:
                return arraysOperations.getElement(index);
            // break;
            case 2:
                arraysOperations.updateElement(index, element);
                break;
            case 3:
                arraysOperations.deleteElement(index);
                break;
            case 4:
                arraysOperations.addElement(element);
                break;
            case 5:
                return arraysOperations.getSize();
            case 6:
                 arraysOperations.printAll();
                 break;
            case 7: 
                 arraysOperations.sort();
            // break;
        }
        return null;
    }
    
    public void ArraysUtils() {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        ArraysOperations arraysOperations = new ArraysOperations(length);

        int choice = -1, index = -1, element = -1;
        do {
            System.out.println("\nArray Operations Menu:");
            System.out.println("1. Get Element");
            System.out.println("2. Update Element");
            System.out.println("3. Delete Element");
            System.out.println("4. Add Element");
            System.out.println("5. Get Size");
            System.out.println("6. Get All the elements");
            System.out.println("7. Sort the Array");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }
            System.out.print("Enter index (or -1 if not applicable): ");
            index = scanner.nextInt();
            element = -1;
            if (choice == 2 || choice == 4) {
                System.out.println("Enter element:");
                element = scanner.nextInt();
            }
           
           Integer result = DoOPerations(choice, index, element, arraysOperations);
            if (result != null) {
                if (choice == 1) {
                    System.out.println("Element at index " + index + ": " + result);
                } else if (choice == 5) {
                    System.out.println("Array size: " + result);
                }
            }
        } while (choice != 0);

        scanner.close();
    }

}
