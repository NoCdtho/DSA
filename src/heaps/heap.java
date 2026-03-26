package heaps;

import java.util.ArrayList;

public class heap<T extends Comparable<T>> {

    private ArrayList<T> list;
    public heap(){
        list = new ArrayList<>();
    }
    public void swap(int first, int second){
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }
    private int parent(int index){
        return (index - 1)/2;
    }
    private int left(int index){
        return index * 2 + 1;
    }
    private int right(int index){
        return index*2 + 2;
    }
    public void insert(T value){
        list.add(value);
        upheap(list.size()-1);
    }
    private void upheap(int index){
        if(index == 0){
            return;
        }
        int p = parent(index);
        if(list.get(index).compareTo(list.get(p)) < 0){  /// means if the list.get(index) value < list.get(parent);
            swap(index, p);
            upheap(p);
        }
    }
    public T remove() throws Exception {
        if(list.isEmpty()){
            throw new Exception("the heap is empty");
        }
        T temp = list.get(0);
        T last = list.remove(list.size() -1);
        if(!list.isEmpty()){
            list.set(0, last);
            downheap(0);
        }
        return temp;
    }
    private void downheap(int index){
        int min = index; //1
        int left = left(index); //3
        int right = right(index); //4

        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0){ /// means list.get(min) > list.get(left)
            min = left;
        }

        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0){
            min = right;
        }

        if(min != index){
            swap(min, index);
            downheap(min);
        }
    }

    /* after calling the func, it returns the list of elements from the heap */
    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();

        while(!list.isEmpty()){
            data.add(this.remove());
        }
        return data;
    }

}
