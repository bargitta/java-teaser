package com.bargittachen;

import java.util.*;
import java.util.LinkedList;

/**
 * Implement a stack using two queues
 */
public class QStack<T> {

    public boolean push(T element){
        if(element != null){
            boolean success = queue1.isEmpty() ? queue2.offer(element) : queue1.offer(element);
            return success;
        }
        return false;
    }

    public T pop(){
        if(queue1.isEmpty() && queue2.isEmpty())
            return null;
        if(queue1.isEmpty()){
            while(queue2.size() > 1){
                queue1.offer(queue2.poll());
            }
            return  queue2.poll();
        }else{
            while(queue1.size() > 1){
                queue2.offer(queue1.poll());
            }
            return  queue1.poll();
        }
    }

    private Queue<T> queue1 = new LinkedList<T>();
    private Queue<T> queue2 = new LinkedList<T>();

}
