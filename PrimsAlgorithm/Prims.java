/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimsAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 * @author Mrudul
 */
public class Prims {
    
    private List<Vertex> unvisitedVertexes;
    private List<Edge> spanningTree;
    private PriorityQueue<Edge> heap;
    private double totalCost;

    public Prims(List<Vertex> unvisitedVertexes) {
        this.unvisitedVertexes = unvisitedVertexes;
        this.spanningTree = new ArrayList<>();
        this.heap = new PriorityQueue<>();
    }
    
    
    
    public void primsAlgo(Vertex vertex){
        
        this.unvisitedVertexes.remove(vertex);
        
        while(!unvisitedVertexes.isEmpty()){
            for(Edge edge:vertex.getAdjacency()){
                if( this.unvisitedVertexes.contains(edge.getTargetVertex())){
                    this.heap.add(edge);
                }
            }
            
            Edge minEdge = heap.remove();
            
            spanningTree.add(minEdge);
            totalCost += minEdge.getWeight();
            vertex = minEdge.getTargetVertex();
            unvisitedVertexes.remove(vertex);
        }
    }
    
    public void MST(){
        
        System.out.println("Minimum Cost>>"+totalCost);
        
        for(Edge edge:spanningTree){
            System.out.println(edge.getSourceVertex()+"--"+edge.getTargetVertex());
        }
    }
}
