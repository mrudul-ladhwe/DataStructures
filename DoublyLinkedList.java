/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrudul
 */
public class DoublyLinkedList {
    Node head;
    
    class Node{
        int data;
        Node next;
        Node prev;
        
        Node(int d){
            this.data = d;
        }
    }
    
    public void addNodeAtFirst(int val){
        Node newNode = new Node(val);
        
        if(head == null){
            head = newNode;
        }
        else{
            Node n = head;
            head = newNode;
            head.next = n;
            n.prev = head;
        }
    }
    
    public void addNodeAfterGivenNode(int afterNode, int val){
        Node newNode = new Node(val);
        Node n = head;
        
        while(n.data != afterNode){
            n = n.next;
        }
        
        newNode.next = n.next;
        newNode.next.prev = newNode;
        n.next = newNode;
        newNode.prev = n;
        
    }
    
    public void addNodeAtENnd(int val){
        Node newNode = new Node(val);
        Node n = head;
        
        while(n.next != null){
            n = n.next;
        }
        
        n.next = newNode;
        newNode.prev = n;
        newNode.next = null;
    }
    
    public void addNodeBeforeGivenNode(int beforeNode, int val){
        Node newNode = new Node(val);
        Node n = head;
        
        while(n.data != beforeNode){
            n = n.next;
        }
        
        n.prev.next = newNode;
        newNode.prev = n.prev;
        newNode.next = n;
        n.prev = newNode;
    }
    
    public void delete(int val){
        Node n = head;
        
        if(head.data == val){
            head = n.next;
            head.prev = null;
        }
        else{
        
            while(n != null && n.data != val){
                n = n.next;
            }
            
            if(n.next != null){
                n.next.prev = n.prev;
                n.prev.next = n.next;
                n.next = null;
                n.prev = null;
            }
            else{
                n.prev.next = null;
                n.next = null;
                n.prev = null;
            }
        }
    }
    
    public void searchNode(int val){
        Node n= head;
        
        while(n != null && n.data != val){
            n = n.next;
        }
        
        if(n != null){
            System.out.println("Node found");
        }
        else{
            System.out.println("Node not found");
        }
    }
    
    public void dislay(){
        Node n = head;
        
        System.out.println("Doubly LinkedList");
        while(n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }
    
    public static void main(String[] args){
        DoublyLinkedList  dll = new DoublyLinkedList();
        
        dll.addNodeAtFirst(2);
        dll.addNodeAtFirst(44);
        dll.addNodeAtFirst(66);
        //dll.dislay();
        dll.addNodeAtFirst(5);
        dll.dislay();
        
        dll.addNodeAfterGivenNode(5, 9);
        dll.dislay();
        
        dll.addNodeAtENnd(11);
        dll.dislay();
        
        dll.addNodeBeforeGivenNode(9, 22);
        dll.dislay();
        
        dll.delete(9);
        dll.dislay();
        
        dll.delete(5);
        dll.dislay();
        
        dll.delete(11);
        dll.dislay();
        
        dll.searchNode(66);
        dll.searchNode(0);
    }
    
}
