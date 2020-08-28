/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrudul
 */
import java.util.*;

public class Trie {
    
    class TrieNode{
        Map<Character, TrieNode> children;
        boolean endOfWord;
        
        public TrieNode(){
            children = new HashMap<>();
            endOfWord = false;
        }
    }
    
    public TrieNode root;
    public Trie(){
        root = new TrieNode();
    }
    
    public void insert(String word){
        TrieNode curr = root;
        
        for(int i=0; i < word.length(); i++){
            char ch = word.charAt(i);
            TrieNode node = curr.children.get(ch);
            if(node == null){
                node = new TrieNode();
                curr.children.put(ch, node);
            }
            curr = node;
        }
        
        curr.endOfWord = true;
    }
    
    public boolean search(String word){
        TrieNode curr = root;
        
        for(int i=0; i < word.length(); i++){
            char ch = word.charAt(i);
            TrieNode node = curr.children.get(ch);
            if(node == null){
                return false;
            }
            curr = node;
        }
        
        //return true of current's endOfWord is true else return false.
        return curr.endOfWord;  
    }
    
    public void delete(String word){
        deleteUtil(root, word, 0);
    }
    
    public boolean deleteUtil(TrieNode curr, String word, int index){
        if(index == word.length()){
            if(!curr.endOfWord){
                return false;
            }
            
            curr.endOfWord = false;
            return curr.children.size() == 0;
        }
        
        char ch = word.charAt(index);
        TrieNode node = curr.children.get(ch);
        if(node == null){
            return false;
        }
        
        boolean shouldDelete = deleteUtil(node, word, index+1);
        
        if(shouldDelete){
            curr.children.remove(ch);
            return curr.children.size() == 0;
        }
        return false;
    }
    
    public static void main(String[] args){
            Trie t = new Trie();
            
            t.insert("abc");
            t.insert("lmn");
            t.insert("abgl");
            t.insert("abcde");
            
            System.out.println("ans>>>"+t.search("abc"));
            System.out.println("ans>>>"+t.search("abcd"));
            
            t.delete("abc");
            System.out.println("ans>>>"+t.search("abc"));
            System.out.println("ans>>>"+t.search("abcde"));
            
    }
    
}
