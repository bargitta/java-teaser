package com.bargittachen;

import java.util.Stack;

/**
 * Implement a queue with two stacks
 */
public class SQueue<T>{

    /**
     * Enqueue an element
     * @param element of type T
     * @return false with invalid element
     */
    public boolean offer(T element){
        if(element == null){
            return false;
        }
        stack1.push(element);
        return true;
    }

    /**
     * Dequeue an element
     * @return null when queue is empty
     */
    public T poll(){
        if(stack1.isEmpty() && stack2.isEmpty()) {
            return null;
        }
        if(!stack2.isEmpty()) {
            return stack2.pop();
        }
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    //stack1 is used for enqueue
    private Stack<T> stack1 = new Stack<T>();

    //stack2 is used for dequeue
    private Stack<T> stack2 = new Stack<T>();

}
