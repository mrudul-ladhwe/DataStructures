/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Mrudul
 */
public class DAGAlgo {
    
    public void shortestPath(List<Vertex> vertexList, Vertex sourceV, Vertex targetV){
        
        sourceV.setDistance(0);
        TopologicalOrder to = new TopologicalOrder();
        to.topoSort(vertexList);
        
        Stack<Vertex> sortedStack = to.getOrder();
        
        for(Vertex v:sortedStack){
            for(Edge e: v.getAdjacencyList()){
                Vertex x = e.getSourceVertex();
                Vertex y = e.getTargetVertex();
                
                double newDistance = x.getDistance() + e.getWeight();
                
                if(newDistance < e.getTargetVertex().getDistance()){
                    y.setDistance(newDistance);
                    System.out.println("dist>>>"+y.getDistance());
                    y.setPredecessor(x);
                            
                }
            }
        }
        
        if(targetV.getDistance() == Double.MAX_VALUE){
            System.out.println("No shortest Path");
        }
        else{
            System.out.println("Shortest Path ditance"+targetV.getDistance());
        }
        
    }
    
    public void showShortestPath(Vertex targetVertex){
        
        List<Vertex> list = new ArrayList<>();
        Vertex actual = targetVertex;
        
        list.add(actual);
        
        while( actual.getPredecessor() != null){
            actual = actual.getPredecessor();
            list.add(actual);
        }
        
        Collections.reverse(list);
        System.out.println(list);
    }
    
}
