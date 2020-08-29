/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BellmanFordAlgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mrudul
 */
public class Vertex {
    
    private String name;
    private List<Edge> adjacencyList;
    private boolean visited;
    private Vertex predecessor;
    private double distance = Double.MAX_VALUE;
    
    public Vertex(String name){
        this.name = name;
        this.adjacencyList = new ArrayList<>();
    }
    
    public void addNeighbour(Edge edge){
        this.adjacencyList.add(edge);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Edge> getAdjacencyList() {
        return adjacencyList;
    }

    public void setAdjacencyList(List<Edge> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
