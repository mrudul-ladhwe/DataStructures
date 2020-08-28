/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrudul
 */
public class SInglyCircularLinkedList {
    Node tail;
    Node head;
    int size = 0;
    
    class Node{
        int data;
        Node next;
        
        Node(int d){
        this.data = d;
        }
    }
    
    public void addNode(int val){
        Node newNode = new Node(val);
        
        if(head == null){
            head = newNode;
        }
        else{
            tail.next = newNode;
        }
        tail = newNode;
        tail.next = head;
        size++;
     }
    
    public boolean searchNode(int val){
        Node n = head;
        
        if(head == null){
            return false;
        }
        else{
            do{
                if(n.data == val){
                    return true;
                }
                n = n.next;
            }while(n != head);
            return false;
        }
    }
    
    public void deleteNode(int val){
        Node n = head;
        
        if(head.data == val){
            head = n.next;
            tail.next = head;
        }
        else{
            do{
                Node nextNode = n.next;
                if(nextNode.data == val){
                    n.next = nextNode.next;
                    break;
                }
                n = n.next;
            }while(n != head);
        }
    }
    
    public void display(){
        Node n = head;
        
        System.out.println("Singly Circular Linked List of size :"+size);
        do{
            System.out.println(n.data);
            n = n.next;
        }while(n != head);
    }
    
    public static void main(String[] args){
        SInglyCircularLinkedList scll = new SInglyCircularLinkedList();
        boolean ans;
        
        scll.addNode(3);
        scll.addNode(22);
        scll.addNode(11);
        scll.addNode(44);
        scll.addNode(77);
        scll.display();
        
        ans = scll.searchNode(22);
        System.out.println(ans);
        ans = scll.searchNode(18);
        System.out.println(ans);
        
        scll.deleteNode(3);
        scll.deleteNode(11);
        scll.deleteNode(77);
        
        scll.display();
    }
    
}
