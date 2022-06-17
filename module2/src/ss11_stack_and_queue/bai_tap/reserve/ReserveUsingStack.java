package ss11_stack_and_queue.bai_tap.reserve;

import java.util.Arrays;
import java.util.Stack;

public class ReserveUsingStack {
    public static void main(String[] args) {
        Integer[] arr = new Integer[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        System.out.println("Arrays Integer before reserve: ");
        Arrays.asList(arr).forEach(System.out::println);

        Stack<Integer> stack = new Stack<>();
        Arrays.asList(arr).forEach(e->stack.push(e));

        int size = stack.size();
        for (int i = 0; i <size ; i++) {
            arr[i] = stack.pop();
        }
        System.out.println("Arrays Integer after reserve:");
        Arrays.asList(arr).forEach(System.out::println);

        System.out.println("-------------");

        Stack<String> stringStack = new Stack<>();
        String b = "Hello World";
        System.out.println("Arrays String before reserve: ");
        System.out.println(b);
        Arrays.asList(b.split("")).forEach(e->stringStack.push(e));

        StringBuilder stringBuilder = new StringBuilder();
        int sizeStringStack = stringStack.size();

        for (int i = 0; i < sizeStringStack; i++) {
            stringBuilder.append(stringStack.pop());
        }
        System.out.println("Arrays String after reserve:");
        System.out.println(stringBuilder);


    }
}
