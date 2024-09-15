package mustafakhan.uk.to.dsa.algorithms.sort.insertion;

public class InsertionSort {
    public int[] sort(int [] array){
        for(int i=0;i<array.length;i++){
            int j=i;
            while(j>0 && array[j]<array[j-1]){
                int temp=array[j];
                array[j]=array[j-1];
                array[j-1]=temp;
                j--;
            }
        }
        return array;
    }
}
