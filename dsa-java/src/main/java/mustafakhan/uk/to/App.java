package mustafakhan.uk.to;

import java.util.Scanner;

import mustafakhan.uk.to.dsa.dataStructures.ArrayList.ArrayListUtilities;
import mustafakhan.uk.to.dsa.dataStructures.arrays.ArraysUtilities;

public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                new ArraysUtilities().ArraysUtils();
                break;
            
            case 2:
                new ArrayListUtilities().ArrayListUtils();
                break;
        
            default:
                break;
            case 3:
                new RandomArray().pradeepArray();
        }
        
       
       
        
}
}
