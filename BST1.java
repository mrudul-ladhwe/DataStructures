/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrudul
 */
public class BST1 {
    
    Node root;
    
    class Node{
        int key;
        Node right;
        Node left;
        
        Node(int k){
            key = k;
            right = left = null;
        }
    }
    
    BST1(){
        root = null;
    }
    
    public void insert(int k){
        root = insertN(root, k);
    }
    
    public Node insertN(Node root, int k){
        
        if(root == null){
            root = new Node(k);
            return root;
        }
        
        if(k < root.key){
            root.left = insertN(root.left, k);
        }
        else if(k > root.key){
            root.right = insertN(root.right, k);
        }
        return root;
    }
    
    public int height(Node root){
        if(root == null){
            return 0;
        }
        else{
            int lheight = height(root.left);
            int rheight = height(root.right);

            return Math.max(lheight, rheight) + 1;
        }
    }
    
    public void displayInorder(Node root){
        if(root.left != null){
            displayInorder(root.left);
        }
        
        System.out.print(root.key+"-> ");
        
        if(root.right != null){
            displayInorder(root.right);
        }
    }
    
    public void displayPreorder(Node root){
        
            System.out.print(root.key + "-> ");
            
            if(root.left != null){
                displayPreorder(root.left);
            }
            
            if(root.right != null){
                displayPreorder(root.right);
            }
    }
    
    public void displayPostorder(Node root){
            if(root.left != null){
                displayPostorder(root.left);
            }
            
            if(root.right != null){
                displayPostorder(root.right);
            }
            
            System.out.print(root.key + "-> ");
    }
    
    public void dfs(Node root, int level){
        if(root == null){
            return;
        }
        if(level == 1){
            System.out.print(root.key+" ");
        }
        else if(level > 1){
            dfs(root.left, level -1);
            dfs(root.right, level -1);
        }
    }
    
    public void dfsCall(){
        int h = height(root);
        for(int i =0; i <= h;i++){
            dfs(root,i);
        }
    }
    
    public void deleteKey(int key){
        root = delete(root, key);
    }
    
    public Node delete(Node root, int num){
        if(root == null){
            return root;
        }
        if(num < root.key){
           root.left = delete(root.left, num);
        }
        else if(num > root.key){
            root.right = delete(root.right, num);
        }
        else{
            if(root.left == null)
                return root.left;
            else if(root.right == null)
                return root.right;
            
            root.key = minValue(root.right);
            root.right = delete(root.right, root.key);
            
        }
        
        return root;
        
    }
    
    public int minValue(Node root){
        int min = root.key;
        
        while(root.left != null){
            min = root.left.key;
            root = root.left;
        }
        
        return min;
    }
    
    public static void main(String[] args){
        BST1 bst = new BST1();
        
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
        
        System.out.println("Inorder>>>");
        bst.displayInorder(bst.root);
        System.out.println();
        
        System.out.println("Preorder>>>");
        bst.displayPreorder(bst.root);
        System.out.println();
        
        System.out.println("Postorder>>>");
        bst.displayPostorder(bst.root);
        
        int h = bst.height(bst.root);
        System.out.println("height>>>"+h);
        
        bst.dfsCall();
        
        bst.deleteKey(20);
        System.out.println();
        bst.displayInorder(bst.root);
        
    }
    
}
