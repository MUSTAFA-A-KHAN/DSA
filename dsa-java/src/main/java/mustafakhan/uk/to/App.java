package mustafakhan.uk.to;

import java.util.Scanner;

import mustafakhan.uk.to.dsa.dataStructures.arrays.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        ArraysOperations arraysOperations = new ArraysOperations(length);
        for (int i = 0; i < length; i++) {
            arraysOperations.addElement(scanner.nextInt());
        }

        System.out.println("Element at index: ");
        int index = scanner.nextInt();
        arraysOperations.getElement(index);
        scanner.close();

        
    }
}
