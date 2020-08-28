/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrudul
 */
public class StackLinkedList {
    StackNode head;
    
    class StackNode{
        int data;
        StackNode next;
        
        StackNode(int d){
            this.data = d;
        }
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void push(int val){
        StackNode newNode = new StackNode(val);
        
        if(isEmpty()){
            head = newNode;
        }
        else{
            StackNode n = head;
            head = newNode;
            head.next = n;
        }
    }
    
    public StackNode pop(){
        if(isEmpty()){
            System.out.println("Stack Linked list empty");
            return null;
        }
        else{
            StackNode poppedElement = head;
            head = head.next;
            return poppedElement;
        }
    }
    
    public StackNode peek(){
        if(isEmpty()){
            System.out.println("Stack Linked list empty");
            return null;
        }
        else{
            StackNode p = head;
            return p;
        }
    }
    
    public void display(){
        StackNode n = head;
        System.out.println("Stack as Linked list:");
        
        while(n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }
    
    public static void main(String[] args){
        StackLinkedList sll = new StackLinkedList();
        
        sll.push(3);
        sll.push(5);
        sll.push(9);
        sll.push(11);
        sll.display();
        
        StackNode x = sll.pop();
        System.out.println("Popped element: "+x.data);
        sll.display();
        
        StackNode p = sll.peek();
        System.out.println("Peek: "+p.data);
        sll.display();
        
    }
}
