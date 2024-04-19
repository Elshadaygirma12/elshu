/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linear_queue;

/**
 *
 * @author HP
 */
public class LinearQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;
    
    public LinearQueue(int size){
        maxSize = size;
        front = 0;
        rear = -1;
        queueArray = new int[maxSize];
    
    }
    public void enqueue(int data){
        if(rear == maxSize - 1){
            System.out.println("Queue is full. Cannot enqueue.");
        }else{
            queueArray[++rear] = data;
            System.out.println(data + "enqueued to the queue");
        }
    }
    public void dequeue(){
        if(front > rear){
            System.out.println("Queue is empty.");
        }else{
            System.out.println(queueArray[front++] + "dequeued from the queue");
        }   
    }
    public void display(){
        if(front > rear){
            System.out.println("Queue is empty");
        } 
        else{
            System.out.print("Queue:");
            for(int i = front; i <= rear; i++){
                System.out.print(queueArray[i] + "");
            }
            System.out.println();
        }
    }
        
    public static void main(String[] args){
        LinearQueue queue = new LinearQueue(5);
        
        
        queue.enqueue(10);
        queue.enqueue(20);
        
        
        queue.display();
        
        queue.dequeue();
        
        queue.display();
        
        queue.enqueue(30);
        
        queue.display();
    }   
        
    

}
