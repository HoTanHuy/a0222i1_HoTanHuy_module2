package ss11_stack_and_queue.thuc_hanh.my_generic_stack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;
    public MyGenericStack(){
        stack = new LinkedList<>();
    }
    public void push(T e){
        stack.addFirst(e);
    }
    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        if (stack.size() == 0){
            return true;
        }
        return false;
    }

}
