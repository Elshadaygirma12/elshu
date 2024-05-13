/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraystack;

/**
 *
 * @author HP
 */
public class ArrayStack {
    private int[] stack;
    private int top;
    
    public ArrayStack(int capacity){
        stack = new int[capacity];
        top=-1;
    }
    public boolean isFull(){
        return top == stack.length - 1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public void push(int item){
        if(isFull()){
            throw new IllegalStateException("Stack is full");
        }
        stack[++top] = item ;   
    }
    public int pop(){
        if(isEmpty()){
            throw new IllegalStateException("stack is empty");
        }
        return stack[top--];
    }
    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException("stack is empty");
        }
        return stack[top];
        
    }
    public int size(){
        return top + 1;
    }
    public static void main(String[] args){
        ArrayStack mystack = new ArrayStack(3);
        mystack.push(11);
        mystack.push(9);
        mystack.push(90);
        mystack.pop();
        for(int i = 0; i < mystack.size();i++){
            System.out.println(mystack.stack[i]);
            
            
            
        }
        
    }

    
}
