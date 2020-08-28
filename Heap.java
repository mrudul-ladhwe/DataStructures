/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrudul
 */
public class Heap {
    
    public int[] heap;
    public int size;
    
    public Heap(int capacity){
        heap = new int[capacity];
    }
    
    public boolean isFull(){
        return size == heap.length;
    }
    
    public int parent(int index){
        return ((index - 1) / 2);
    }
    
    public void insert(int num){
        if(isFull()){
            throw new IndexOutOfBoundsException("Heap is full");
        }
        heap[size] = num;
        
        fixHeapAbove(size);
        size++;
        
    }
    
    public void fixHeapAbove(int index){
        int nwVal = heap[index];
        while(index > 0 && nwVal > heap[parent(index)]){
            heap[index] = heap[parent(index)];
            index = parent(index);
        }
        
        heap[index] = nwVal;
        
    }
    
    public boolean isEmpty(){
        return size==0;
    }
    
    public int getChild(int index, boolean left){
        if(left){
            return 2 * index + 1;
        }
        else{
            return 2 * index + 2;
        }
    }
    
    public void fixHeapBelow(int index, int lastIndex){
        int toSwap;
        
        while(index <= lastIndex){
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);
            if(leftChild <= lastIndex){
                if(rightChild > lastIndex){
                    toSwap = leftChild;
                }
                else{
                    if(heap[leftChild] > heap[rightChild]){
                        toSwap = leftChild;
                    }
                    else{
                        toSwap = rightChild;
                    }
                }
                
                if(heap[index] < heap[toSwap]){
                    int temp = heap[index];
                    heap[index] = heap[toSwap];
                    heap[toSwap] = temp;
                }
                else{
                    break;
                }
                
                index = toSwap;
            }
            else{
                break;
            }
        }
    }
    
    public void delete(int index){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Heap is empty");
        }
        
        heap[index] = heap[size-1];
        int parent = parent(index);
        
        if(index == 0 || heap[index] < heap[parent]){
            fixHeapBelow(index, size-1);
        }
        else{
            fixHeapAbove(index);
        }
        
        size--;
    }
    
    public void sort(){
        int lastIndex = size-1;
        for(int i= 0; i< lastIndex; i++){
            int temp = heap[0];
            heap[0] = heap[lastIndex -i];
            heap[lastIndex -i] = temp;
            
            fixHeapBelow(0,lastIndex -i -1);
        }
    }
    
    public void display(){
        
        for(int i =0; i < size; i++){
            System.out.print(heap[i] + ", ");
        }
        
        System.out.println();
    }
    
    public int peek(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Heap is empty");
        }
        return heap[0];
    }
    
    public static void main(String[] args){
        Heap h = new Heap(10);
        
        h.insert(80);
        h.insert(75);
        h.insert(60);
        h.insert(68);
        h.insert(55);
        h.insert(40);
        h.insert(52);
        h.insert(67);
        
        h.display();
        
        //h.delete(1);
        //h.display();
        
        //System.out.println("peek>>"+h.peek());
        
        //h.delete(0);
        //h.display();
        
        //System.out.println("peek>>"+h.peek());
        
        h.sort();
        h.display();
        
    }
    
}
