/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrudul
 */
public class QueueArray {
    int[] arrQueue = new int[10];
    int front =0;
    int back =0;
    
    public int size(){
        return back - front;
    }
    
    public void enqueue(int val){
        if(size() == arrQueue.length){
            int[] newArr = new int[2 * arrQueue.length];
            System.arraycopy(arrQueue, 0, newArr, 0, arrQueue.length);
            arrQueue = newArr;
        }
        arrQueue[back] = val;
        back++;
    }
    
    public void dequeue(){
        if(size() == 0){
            System.out.println("Queue is empty");
        }
        
        front++;
        
        if(size() == 0){
           front = 0;
           back = 0;
        }
    }
    
    public void peek(){
        if(size() == 0){
            System.out.println("Queue is empty");
        }
        
        System.out.println("peek>>"+arrQueue[front]);
    }
    
    public void display(){
        System.out.println("Queue:");
        for(int i = front; i < back ;i++){
            System.out.println(arrQueue[i]);
        }
    }
    
    public static void main(String[] args){
        QueueArray qa = new QueueArray();
        
        qa.enqueue(2);
        qa.enqueue(4);
        qa.enqueue(6);
        qa.display();
        
        qa.dequeue();
        qa.display();
        
        qa.peek();
        
    }
    
}
