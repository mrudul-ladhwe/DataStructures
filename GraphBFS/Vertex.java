/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphBFS;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mrudul
 */
public class Vertex {
    private String name;
        private boolean visited;
        private List<Vertex> adjacencyList;
        
        public Vertex(String name){
            this.name = name;
            this.adjacencyList = new ArrayList<>();
        }
    
    public void setVisited(boolean visited){
        this.visited = visited;
    }
    
    public boolean isVisited(){
        return visited;
    }
    
    public void addNeighbour(Vertex v){
        this.adjacencyList.add(v);
    }
    
    public List<Vertex> getAdjacencyList(){
        return adjacencyList;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
    
}
