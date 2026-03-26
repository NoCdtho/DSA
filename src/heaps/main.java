package heaps;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws Exception{
        heap<Integer> h = new heap<>();
        h.insert(54);
        h.insert(34);
        h.insert(12);
        h.insert(56);
        h.insert(8);

//        System.out.println(h.remove());

        ArrayList list = h.heapSort();
        System.out.println(list);
    }
}
