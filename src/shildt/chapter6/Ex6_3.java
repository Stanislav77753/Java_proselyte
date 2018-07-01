package shildt.chapter6;

import shildt.chapter9.StackEmptyException;
import shildt.chapter9.StackFullException;


public class Ex6_3 {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>(5);

            try {
                for(int i = 0 ; i < 7; i++) {
                    myStack.push((Integer) (0 + (int) (Math.random() * 100)));
                }
            }
            catch (StackFullException e){
                System.out.println(e.toString());
            }

        myStack.printStack();
    }
}

class MyStack<T>{
    private T[] arr;
    private int size;
    private int top;

    public MyStack(int size){
        this.size = size;
        arr = (T[]) new Object[size];
        this.top = -1;
    }

    public T pop() throws StackEmptyException {
        if(top == -1){
            throw new StackEmptyException();
        }
        else{
            top-=1;
        }
        return arr[top+1];
    }

    public void push(T element) throws StackFullException{
        if(top == size-1){
            throw new StackFullException(size);
        }
        else{
            top+=1;
            arr[top] = element;
            System.out.println("Element is added in stack");
        }
    }
    public void printStack(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        for(int i = 0; i < top + 1; i++){
            System.out.println(i + " element - " + arr[i]);
        }
    }


}
