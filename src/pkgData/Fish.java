/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgData;

/**
 *
 * @author schueler
 */
public class Fish {
    private String name;
    private int weight;
    private String color;

    public Fish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getColor() {
        return  color;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
}
