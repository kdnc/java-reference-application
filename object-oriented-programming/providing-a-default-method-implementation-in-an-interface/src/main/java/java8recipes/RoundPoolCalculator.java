/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java8recipes;

/**
 *
 * @author Juneau
 */
public class RoundPoolCalculator implements Volume {
    
    public RoundPoolCalculator(){
        
    }
    
    /**
     * Overriding default and betting that the values are in-line with round pool
     * that contains a uniform depth.
     * @param depthValues
     * @param measurementValues
     * @return 
     */
    @Override
    public double calculateVolume(Double[] depthValues, Double[] measurementValues){
        double depth = depthValues[0];
        double radius = measurementValues[0];
        return (radius * radius) * 3.14 * depth;
    }
}
