/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DijkstraAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 * @author Mrudul
 */
public class DijkstraAlgo {
    
    public void computePath(Vertex sourceVertex){
        
        sourceVertex.setDistance(0);
        PriorityQueue<Vertex> priorityQ = new PriorityQueue<>();
        priorityQ.add(sourceVertex);
        
        while(! priorityQ.isEmpty()){
            
            Vertex actual = priorityQ.poll();
            
            for(Edge e:actual.getAdjacencyList()){
                
                Vertex targetV = e.getTargetV();
                
                double dist = actual.getDistance() + e.getWeight();
                
                if( dist < targetV.getDistance()){
                    priorityQ.remove(targetV);
                    targetV.setDistance(dist);
                    targetV.setPredecessor(actual);
                    priorityQ.add(targetV);
                }
            }
        }
        
    }
    
    public List<Vertex> path(Vertex target){
        
        List<Vertex> shortestPath = new ArrayList<>();
        
        for(Vertex v = target; v != null; v = v.getPredecessor()){
            shortestPath.add(v);
        }
        
        Collections.reverse(shortestPath);
        
        return shortestPath;
    }
    
}
