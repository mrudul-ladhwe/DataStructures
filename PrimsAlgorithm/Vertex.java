/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimsAlgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mrudul
 */
public class Vertex {
    
    private String name;
    private boolean visited;
    private Vertex previousVertex;
    private List<Edge> adjacency;

    public Vertex(String name) {
        this.name = name;
        this.adjacency = new ArrayList<>();
    }
    
    public void addNeighbour(Edge edge){
        this.adjacency.add(edge);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex getPreviousVertex() {
        return previousVertex;
    }

    public void setPreviousVertex(Vertex previousVertex) {
        this.previousVertex = previousVertex;
    }

    public List<Edge> getAdjacency() {
        return adjacency;
    }

    public void setAdjacency(List<Edge> adjacency) {
        this.adjacency = adjacency;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
    
    
    
}
