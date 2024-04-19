/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circularqueue;

/**
 *
 * @author HP
 */
public class CircularQueue<T>{
    private T[] queue;
    private int front;
    private int rear;
    private int size;
    
    @SuppressWarnings("unchecked")
    public CircularQueue(int capacity){
        queue = (T[]) new Object[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == queue.length;
    }
    public void enqueue(T item){
        if(isFull()){
            throw new IllegalStateException("Queue is full");
        }
        queue[rear] = item;
        rear = (rear + 1) % queue.length;
        size++;
    }
    public T dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        T item = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return item;
    }   
    public T peek(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }
    public int size(){
        return size;
    }
}
