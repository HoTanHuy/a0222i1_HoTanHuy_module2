package ss10_arraylist_linkedlist.bai_tap.array_list;

import java.util.Arrays;

public class MyList<E> implements Cloneable {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements;
    MyList(){elements = (E[]) new Object[DEFAULT_CAPACITY]; }
    MyList(int initCapacity){
        elements = (E[]) new Object[initCapacity];
    }
    public void add(int id){
        int newSize = elements.length;
        elements = Arrays.copyOf(elements,newSize);
    }

}
