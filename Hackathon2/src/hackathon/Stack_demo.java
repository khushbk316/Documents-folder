package hackathon;

import java.util.Stack;

public class Stack_demo {
    int i;
    //pushing stack elements...
    public static void stack_push(java.util.Stack<Integer> stack)
    {
        int i;
        for(i=0;i<5;i++)
            stack.push(i);
    }

    //pop out stack elements....
    public static void stack_pop(java.util.Stack<Integer> stack)
    {
        System.out.println("element after pop process......");
        for(int i=0;i<5;i++) {
            int integer = stack.pop();
            System.out.println(integer);
        }
    }
    public static void stack_peek(java.util.Stack<Integer> stack)
    {
        System.out.println("top element is....");
        int peekElement=stack.peek();
        System.out.println(peekElement);
    }
    public static void stack_search(java.util.Stack<Integer> stack, int element)

    {
        int position=stack.search(element);
        if(position==-1)
            System.out.println("element does not exist....");
        else
            System.out.println("element exist at..."+position);
    }
    public static void main(String ar[])
    {
        Stack<Integer> stack=new Stack<Integer>();
        stack_push(stack);
        stack_peek(stack);
        stack_pop(stack);
        stack_search(stack, 2);

    }
}

