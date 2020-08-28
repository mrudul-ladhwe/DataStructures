/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrudul
 */
public class SinglyLL {
    
    Node head;
    
    class Node{
        int data;
        Node next;
        
        public Node(int d){
            this.data = d;
            this.next = null;
        }
        
    }
    
    public void addNode(int val){
        
        Node node = new Node(val);
        
        if(head == null){
            head = node;
        }
        else{
            Node node2 = head;
            while(node2.next != null){
                node2 = node2.next;
            }
            node2.next = node;
        }
    }
    
    public void display(){
        
        Node n = head;
        System.out.println("Linked List");
        
        while(n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }
    
    public void deleteNode(int val){
        
        Node n = head;
        Node prev = null;
        
        if(head.data == val){
            head = n.next;
        }
        else{
            while(n != null && n.data != val){
                prev = n;
                n = n.next;
            }
            if(n != null){
                prev.next = n.next;
            }
            if(n == null){
                System.out.println("Node not found");
            }
        }
    }
    
    public void search(int val){
        Node cu = head;
        
        while(cu != null && cu.data != val){
            cu = cu.next;
        }
        
        if(cu != null){
            System.out.println("Node found>>");
        }
        else{
            System.out.println("Node not found>>");
        }
    }
    
    public void insertAtStart(int val){
        Node newNode = new Node(val);
        Node s  = head;
        
        if(s != null){
            head = newNode;
            head.next = s;
        }
    }
    
    public void insertAtEnd(int val){
        Node newNode = new Node(val);
        Node s = head;
        
        while(s.next != null){
            s = s.next;
        }
        
        if(s.next == null){
            s.next = newNode;
        }
    }
    
    public void insertInPosition(int pos, int val){
        int count =1;
        Node newNode = new Node(val);
        Node s = head;
        Node prev = null;
        
        while(count != pos){
            prev = s;
            s = s.next;
            count++;
        }
        
        if(count == pos){
            prev.next = newNode;
            newNode.next = s;
        }
    }
    
    public static void main(String[] args){
        SinglyLL sll = new SinglyLL();
        
        sll.addNode(2);
        sll.addNode(5);
        sll.addNode(7);
        sll.addNode(12);
        sll.addNode(26);
        
        sll.display();
        
        //sll.deleteNode(7);
        
        //sll.display();
        
        //sll.deleteNode(2);
        
        //sll.display();
        
        //sll.deleteNode(26);
        
        //sll.display();
        
        //sll.deleteNode(36);
        
        //sll.search(12);
        //sll.search(40);
        
        sll.insertAtStart(56);
        
        sll.display();
        
        sll.insertAtEnd(11);
        
        sll.display();
        
        sll.insertInPosition(4, 22);
        
        sll.display();
        
        sll.insertInPosition(7, 33);
        
        sll.display();
    }
}
