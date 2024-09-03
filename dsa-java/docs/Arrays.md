# Understanding Arrays

In programming, arrays are commonly used to store collections of elements. 

## Properties: Length and Size

Two important concepts related to arrays are length and size. This document also explains these concepts and their usage in different contexts, with a focus on Java.

`length`: This is a property of the array object, used to determine the total number of elements the array can hold.



### Length Property

#### Definition
The `length` property of an array provides the total number of elements that the array can hold. It is a fundamental property of arrays.

#### Usage
- **Java Example:**

    ```java
    public class Main {
        public static void main(String[] args) {
            String[] fruits = {"apple", "banana", "cherry"};
            System.out.println(fruits.length);  // Output: 3
        }
    }
    ```

    In this example, the `length` property of the `fruits` array is accessed using `fruits.length`, which returns the number of elements in the array.

### Size Property: 
 `size`: Arrays do not have a size() method.

### Size vs. Length

In Java, the term "size" is generally used in the context of collections, such as `ArrayList`, while "length" is used for arrays.

- **Array Example:** The `length` property is used to determine the size of an array.
- **ArrayList Example:**

    ```java
    import java.util.ArrayList;

    public class Main {
        public static void main(String[] args) {
            ArrayList<String> fruitsList = new ArrayList<>();
            fruitsList.add("apple");
            fruitsList.add("banana");
            fruitsList.add("cherry");

            System.out.println(fruitsList.size());  // Output: 3
        }
    }
    ```

    In this example, the `size()` method of the `ArrayList` class is used to get the number of elements in the list, demonstrating the distinction between `size` and `length`.

