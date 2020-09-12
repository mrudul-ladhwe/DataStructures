/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KruskalAlgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mrudul
 */
public class DisjointSet {
    
    private int nodeCount = 0;
    private int setCount = 0;
    private List<Node> rootNodes;

    public DisjointSet(List<Vertex> vertexes) {
        this.rootNodes = new ArrayList<>(vertexes.size());
        makeSets(vertexes);
    }

    private void makeSets(List<Vertex> vertexes) {
        for(Vertex v:vertexes){
            makeSet(v);
        }
    }

    private void makeSet(Vertex v) {
        Node n = new Node(rootNodes.size(), 0, null);
        v.setNode(n);
        this.rootNodes.add(n);
        nodeCount++;
        setCount++;
    }
    
    public int find(Node n){
        
        Node curr = n;
        
        while(curr.getParent() != null){
            curr = curr.getParent();
        }
        
        Node root = curr;
        curr = n;
        
        while(curr != root){
            Node temp = curr.getParent();
            curr.setParent(root);
            curr = temp;
        }
        
        return root.getId();
    }
    
    public void Union(Node n1, Node n2){
        
        int index1 = find(n1);
        int index2 = find(n2);
        //System.out.println("index1>>"+index1);
        //System.out.println("index2>>"+index2);
        
        if(index1 == index2){// both are in same disjoint set;
            return;
        }
        
        Node root1 = this.rootNodes.get(index1);
        Node root2 = this.rootNodes.get(index2);
        //System.out.println("root1>>"+root1.getRank());
        //System.out.println("roo2>>"+root2.getRank());
        
        if(root1.getRank() < root2.getRank()){
            root1.setParent(root2);
        }
        else if(root1.getRank() > root2.getRank()){
            root2.setParent(root1);
        }
        else{
            root2.setParent(root1);
            root1.setRank(root1.getRank()+1);
        }
        
        setCount--;
        
    }
    
    
}
