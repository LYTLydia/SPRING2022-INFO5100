package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class ThreadSafeQueue<T> {
    private Queue<T> tsq = new LinkedList<>();

    private Object lock;

    public void add( T data){
        synchronized (lock){
            this.tsq.add(data);
        }
    }

    public T remove(){
        synchronized (lock){
            return this.tsq.remove();
        }
    }

    public T peek(){
        synchronized (lock){
            return this.tsq.peek();
        }
    }

    public boolean isEmpty(){
        synchronized (lock){
            return this.tsq.peek() == null;
        }
    }
}
