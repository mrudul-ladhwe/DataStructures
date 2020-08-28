/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrudul
 */
public class HashTableImp {
    Student[] hashTable;
    
    public HashTableImp(){
        hashTable = new Student[10];
    }
    
    //HashTable is always key-value pair
    public void put(String key, String names){
        int hashKey = hashKey(key);
        if(occupied(hashKey)){
            int stopIndex = hashKey;
            if(hashKey == hashTable.length -1){
                hashKey = 0;
            }
            else{
                hashKey++;
            }
            while(occupied(hashKey) && hashKey != stopIndex){
                hashKey = (hashKey + 1) % hashTable.length;
            }
        }
        
        if(occupied(hashKey)){
            System.out.println("element already present at position"+ hashKey);
        }
        else{
            hashTable[hashKey] = new Student(key,names);
        }
    }
    
    public boolean occupied(int index){
        return hashTable[index] != null;
    }
    
    public String get(String key){
        int hashKey = findKey(key);
        if(hashKey == -1){
            return null;
        }
        return hashTable[hashKey].names;
    }
    
    public int findKey(String key){
        int hashKey;
        /*int hashKey = hashKey(key); 
        if(hashTable[hashKey] != null && hashTable[hashKey].key.equals(key)){
            return hashKey;
        }
        else{
            int stopIndex = hashKey;
            if(hashKey == hashTable.length -1){
                hashKey = 0;
            }
            else{
                hashKey++;
            }
            while(hashKey != stopIndex && hashTable[hashKey] != null && !hashTable[hashKey].key.equals(key)){
                hashKey = (hashKey + 1) % hashTable.length;
            }
        }
        if(hashTable[hashKey] != null && hashTable[hashKey].key.equals(key)){
                return hashKey;
            }
            else{
                return -1;
            }*/
        
        for(int i=0; i < hashTable.length; i++){
            if(hashTable[i] != null && hashTable[i].key.equals(key)){
                hashKey = i;
                return hashKey;
            }
        }
        return -1;
    }
    
    public void remove(String key){
        int hashKey = findKey(key);
        if(hashKey == -1){
            System.out.println("Null");
        }
        else{
        hashTable[hashKey] = null;
        }
    }
    
    public void display(){
        for(int i=0; i < hashTable.length; i++){
            if(hashTable[i] == null){
                System.out.println("empty");
            }
            else{
            System.out.println(hashTable[i].names);
            }
        }
    }
    
    public int hashKey(String key){
        return key.length() % hashTable.length;
    }
    
    public static void main(String[] args){
        HashTableImp ht = new HashTableImp();
        
        ht.put("red", "Aditi");
        ht.put("blue", "Siddhi");
        ht.put("green", "Chinmayi");
        ht.put("green2", "Jaju");
        ht.put("yellow", "Shubham");
        
        
        ht.display();
        
        String name = ht.get("red");
        System.out.println("n>>>>"+name);
        
        System.out.println("n>>>>"+ht.get("yellow"));
        
        ht.remove("green2");
        ht.display();
        ht.remove("onrange");
    }
    
}
