/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrudul
 */
public class Stack {
    int max = 10;
    int top;
    int[] arrStack = new int[max];
    
    Stack(){
        top = -1;
    }
    
    public boolean isEmpty(){
        return top < 0;
    }
    
    public void push(int val){
        if(top == arrStack.length){
            int[] newArr = new int[2 * arrStack.length];
            System.arraycopy(arrStack,0,newArr,0,newArr.length);
            arrStack = newArr;
        }

        arrStack[++top] = val;
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            int a = arrStack[top--];
            return a;
        }
    }
    
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
            
        return arrStack[top];
    }
    
    public void display(){
        System.out.println("Stack:");
        for(int i= top; i >= 0; i--){
            System.out.println(arrStack[i]);
        }
    }
    
    public static void main(String[] args){
        Stack s = new Stack();
        
        s.push(2);
        s.push(4);
        s.push(6);
        s.push(8);
        s.display();
        
        s.pop();
        s.display();
        
        int a = s.peek();
        System.out.println("Top element: "+a);
    }
    
}
