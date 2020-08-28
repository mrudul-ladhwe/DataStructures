/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DijkstraAlgorithm;

/**
 *
 * @author Mrudul
 */
public class Edge {
    
    private double weight;
    private Vertex startV;
    private Vertex targetV;
    
    public Edge (double weight, Vertex startV, Vertex targetV){
        this.weight = weight;
        this.startV = startV;
        this.targetV = targetV;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Vertex getStartV() {
        return startV;
    }

    public void setStartV(Vertex startV) {
        this.startV = startV;
    }

    public Vertex getTargetV() {
        return targetV;
    }

    public void setTargetV(Vertex targetV) {
        this.targetV = targetV;
    }
    
    
    
}
