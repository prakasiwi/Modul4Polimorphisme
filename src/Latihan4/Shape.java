/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author galih
 */
public class Shape {
    //membuat variabel
    private String colour;
    //constructor
    public Shape (String colour){
        this.colour=colour;
    }
    @Override
    public String toString(){
        return "Shape[colour="+colour +"]";
    }
    // All shape must have a metod called getArea()
    public double getArea(){
        //we need to return some value to compile the program
        System.out.println("Shape unknow! Cannot compute area!");
        return 0;
    }
}
