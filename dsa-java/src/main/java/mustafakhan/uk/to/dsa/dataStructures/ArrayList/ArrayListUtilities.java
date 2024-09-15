package mustafakhan.uk.to.dsa.dataStructures.ArrayList;

import java.util.Scanner;

public class ArrayListUtilities {


    public Integer DoOPerations(int choice, int index, int element, ArrayListOperations arrayListOperations) {
        switch (choice) {
            case 1:
                return arrayListOperations.GetElement(index);
            // break;
            case 2:
            arrayListOperations.UpdateElement(index, element);
                break;
            case 3:
            arrayListOperations.DeleteElement(index);
                break;
            case 4:
            arrayListOperations.AddElement(element);
                break;
            case 5:
                return arrayListOperations.GetSize();
            case 6:
                arrayListOperations.PrintAll();
            // break;
        }
        return null;
    }
    public void ArrayListUtils() {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        ArrayListOperations arraysOperations = new ArrayListOperations(length);

        int choice = -1, index = -1, element = -1;
        do {
            System.out.println("\nArrayList Operations Menu:");
            System.out.println("1. Get Element");
            System.out.println("2. Update Element");
            System.out.println("3. Delete Element");
            System.out.println("4. Add Element");
            System.out.println("5. Get Size");
            System.out.println("6. Get All the elements");
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
