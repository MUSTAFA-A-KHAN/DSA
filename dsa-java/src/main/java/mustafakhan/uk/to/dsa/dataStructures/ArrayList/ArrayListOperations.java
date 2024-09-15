package mustafakhan.uk.to.dsa.dataStructures.ArrayList;

import java.util.ArrayList;

public class ArrayListOperations {
    private ArrayList<Integer> arrayList;

    public ArrayListOperations(int size) {
        if (size < 0) {
            arrayList = new ArrayList<>();
        } else {
            arrayList = new ArrayList<>(size);
        }

    }

    public void AddElement(int element) {
        arrayList.add(element);
    }

    public Integer GetElement(int index) {
        if (index < 0 || index > arrayList.size()) {
            return null;
        } else {
            return arrayList.get(index);
        }
    }

    public ArrayList<Integer> GetAll() {
        return arrayList;
    }

    public void DeleteElement(int index) {
        if (index < 0 || index > arrayList.size()) {
            System.err.println("invalid index");
        } else {
            arrayList.remove(index);
        }

    }

    public void UpdateElement(int index, int value) {
        arrayList.set(index, value);
    }
    public Integer GetSize(){
        return arrayList.size();
    }
    
    public void PrintAll(){
        System.out.println(arrayList);
    }
}
