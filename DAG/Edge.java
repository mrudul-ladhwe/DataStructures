/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAG;

/**
 *
 * @author Mrudul
 */
public class Edge {
    
    private double weight;
    private Vertex targetVertex;
    private Vertex sourceVertex;

    public Edge(double weight, Vertex sourceVertex, Vertex targetVertex) {
        this.weight = weight;
        this.targetVertex = targetVertex;
        this.sourceVertex = sourceVertex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Vertex getTargetVertex() {
        return targetVertex;
    }

    public void setTargetVertex(Vertex targetVertex) {
        this.targetVertex = targetVertex;
    }

    public Vertex getSourceVertex() {
        return sourceVertex;
    }

    public void setSourceVertex(Vertex sourceVertex) {
        this.sourceVertex = sourceVertex;
    }
    
}
