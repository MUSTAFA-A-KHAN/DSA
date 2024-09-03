package mustafakhan.uk.to.dsa.dataStructures.arrays;

public class AraysOperations {
    private int[] array;
    private int size;

    // constructor to initialize the array and size
    public ArrayOperations(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    // adds the element at the end
    public void addElement(int e) {
        if (size < array.length) {
            array[size] = e;
            size++;
        } else {
            System.out.println("Array is full. Cannot add element" + e);
        }
    }

    // get element from an index
    public int getElement(int index) {
        if (index > array.length || index < 0) {
            System.err.println("out of index");
            return -1; // indicates an error
        }
        return array[index];

    }

    // Update element at an index
    public void updateElement(int index, int e) {
        if (index > size || index < 0) {
            System.err.println("out of index");
        }
        array[index] = e;
        System.out.println("Updation Completed at index:" + index);
    }

    // Remove element from an index
    public void deleteElement(int index) {
        if (index > size || index < 0) {
            System.err.println("out of index");
        }
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];

        }
        size--;
        System.out.println("Element removed successfully.");
    }

    // Get the current size of the array
    public int getSize() {
        return size;
    }

}
