package mustafakhan.uk.to.dsa.algorithms.sort.selection;

public class SelectionSort {
    public int[] sort(int[] array) {
        int n = array.length;
        //iterate over the Array
        for (int i = 0; i < n; i++) {
            //get idx for min element
            int min_idx = i;
            for (int j = min_idx; j < n; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;
            //swap the elements
            int temp = array[i];
            array[i] = array[min_idx];
            array[min_idx] = temp;
        }
        return array;
    }
}
