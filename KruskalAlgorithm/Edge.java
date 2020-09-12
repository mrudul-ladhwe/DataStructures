/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KruskalAlgorithm;

/**
 *
 * @author Mrudul
 */
public class Edge implements Comparable<Edge>{
    
    private double weight;
    private Vertex sourceVertex;
    private Vertex targetVertex;

    public Edge(double weight, Vertex sourceVertex, Vertex targetVertex) {
        this.weight = weight;
        this.sourceVertex = sourceVertex;
        this.targetVertex = targetVertex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Vertex getSourceVertex() {
        return sourceVertex;
    }

    public void setSourceVertex(Vertex sourceVertex) {
        this.sourceVertex = sourceVertex;
    }

    public Vertex getTargetVertex() {
        return targetVertex;
    }

    public void setTargetVertex(Vertex targetVertex) {
        this.targetVertex = targetVertex;
    }

    

    @Override
    public int compareTo(Edge edge) {
        return Double.compare(this.weight, edge.getWeight());
    }
}
