/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BellmanFordAlgorithm;

import java.util.List;

/**
 *
 * @author Mrudul
 */
public class BellmanFord {
    
    private List<Vertex> vertexList;
    private List<Edge> edgeList;

    public BellmanFord(List<Vertex> vertexList, List<Edge> edgeList) {
        this.vertexList = vertexList;
        this.edgeList = edgeList;
    }
    
    public void bellmanFord(Vertex sourceV){
        
        sourceV.setDistance(0);
        
        for(int i = 0; i < vertexList.size()-1; ++i){
            for(Edge e: edgeList){
                
                if(e.getStartV().getDistance() == Double.MAX_VALUE) continue;
                
                double newDist = e.getStartV().getDistance() + e.getWeight();
                if( newDist < e.getTargetV().getDistance()){
                    e.getTargetV().setDistance(newDist);
                    e.getTargetV().setPredecessor(e.getStartV());
                    System.out.println("targetVertex>>"+e.getTargetV()+">>>previous>>"+e.getTargetV().getPredecessor());
                }
                
            }
        }
        
        for(Edge e1:edgeList){
            if(e1.getStartV().getDistance() != Double.MAX_VALUE){
                
                if(hasCycle(e1)){
                    System.out.println("There is a negative cycle");
                    return;
                }
            }
        }
    }

    private boolean hasCycle(Edge e) {
        return e.getStartV().getDistance() + e.getWeight() < e.getTargetV().getDistance();
    }
    
    public void path(Vertex v){
        
        if(v.getDistance() == Double.MAX_VALUE){
            System.out.println("There is no path from source to target");
        }
    
        Vertex actual = v;
        
        while( actual != null){
            System.out.print(actual+" >>>");
            actual = actual.getPredecessor();
        }
    }
    
}
