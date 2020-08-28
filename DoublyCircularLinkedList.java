/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrudul
 */
public class DoublyCircularLinkedList {
    Node head;
    int size =0;
    
    class Node{
        int data;
        Node next;
        Node prev;
        
        Node(int d){
            this.data = d;
        }
    }
    
    public void insertNodeAtEnd(int val){
        Node newNode = new Node(val);
        
        if(head == null){
            head = newNode;
            head.next = null;
            head.prev = null;
            return;
        }
       
            Node last = head.prev;
            newNode.next = head;
            head.prev = newNode;
            if(last != null){
                newNode.prev = last;
                last.next = newNode;
            }
            else{
                newNode.prev = head;
                head.next = newNode;
            }
        
        size++;
    }
    
    public void insertNodeAtStart(int val){
        Node newNode = new Node(val);
        
        Node last = head.prev;
        Node n = head;
        
        
            head = newNode;
            head.next = n;
            n.prev = head;
            if(last !=null){
                head.prev = last;
                last.next = head;
            }
            else{
                n.next = head;
                head.prev = n;
            }
        
        
        size++;
    }
    
    public void insertAfterGivenNode(int val, int givenNode){
        Node newNode = new Node(val);
        Node n = head;
        
        while(n.data != givenNode){
            n = n.next;
        }
        
            newNode.next = n.next;
            n.next.prev = newNode;
            n.next = newNode;
            newNode.prev = n;
        
        size++;
    }
    
    public void searcNode(int val){
        Node n = head;
        
        do{
            if(n.data == val){
                System.out.println("Node found");
                return;
            }
            n = n.next;
        }while(n != head);
        
       System.out.println("Node not found");
    }
    
    public void deleteNode(int val){
        Node n = head;
        
        if(n.data == val){
            n.next.prev = n.prev;
            n.prev.next = n.next;
            head = n.next;
        }
        else{ 
            do{
                if(n.data == val){
                    n.next.prev = n.prev;
                    n.prev.next = n.next;                    
                }
                n = n.next;
            }while(n != head);
        }
    }
    
    public void mergeTwoLists(Node head1,Node head2){
        Node n = head1;
        Node m = head2;
        
        while(n.next != head1){
            n = n.next;
        }
        while(m.next != head2){
            m = m.next;
        }
        
        n.next = head2;
        head2.prev = n;
        m.next = head1;
        head1.prev = m;
        
    }
    
    public void dislay(){
        Node m = head;
        
        System.out.println("Doubly Circular Linked List:");
        do{
            System.out.println(m.data);
            m = m.next;
        }while(m != head);
    }
    
    public static void main(String[] args){
        DoublyCircularLinkedList dcll = new DoublyCircularLinkedList();
        DoublyCircularLinkedList dcll2 = new DoublyCircularLinkedList();
        
        dcll.insertNodeAtEnd(11);
        dcll.insertNodeAtStart(33);
        dcll.insertNodeAtEnd(22);
        //dcll.insertNodeAtEnd(44);
        dcll.insertAfterGivenNode(55,22);
        //dcll.insertNodeAtEnd(77);
        //dcll.insertNodeAtEnd(88);
        dcll.dislay();
        //dcll.searcNode(33);
        //dcll.searcNode(66);
        
        //dcll.deleteNode(33);
        //dcll.deleteNode(88);
        //dcll.deleteNode(44);
        //dcll.dislay();
        
        
        dcll2.insertNodeAtEnd(4);
        dcll2.insertNodeAtStart(2);
        dcll2.insertNodeAtEnd(7);
        dcll2.dislay();
        
        dcll.mergeTwoLists(dcll.head, dcll2.head);
        dcll.dislay();
        
    }
    
}
