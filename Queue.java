/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linearqueuesusingstucks;
import java.util.Stack;
/**
 *
 * @author HP
 */
public class Queue<T>{
    private Stack<T> enqueueStack;
    private Stack<T> dequeueStack;
    
    public Queue(){
        enqueueStack = new Stack<>();
        dequeueStack = new Stack<>();
    }
    
    public void enqueue(T element) {
        enqueueStack.push(element);
    }
    public T denqueue(){
        if (dequeueStack.isEmpty()){
            while (!enqueueStack.isEmpty()){ 
                dequeueStack.push(enqueueStack.pop());
            }
            
        }
        return dequeueStack.pop();
    }
    public boolean isEmpty() {
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }
    public int size() {
        return enqueueStack.size() + dequeueStack.size(); 
    }
}
