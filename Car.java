/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author 4REHMA70
 */
//attributes, getters, and constructors 
public class Car {
    private int registration_num;
    private String Colour;
    private String Make; 
    private String Model;

    public Car(int registration_num, String Colour, String Make, String Model) {
        this.registration_num = registration_num;
        this.Colour = Colour;
        this.Make = Make;
        this.Model = Model;
    }

    public int getRegistration_num() {
        return registration_num;
    }

    public String getColour() {
        return Colour;
    }

    public String getMake() {
        return Make;
    }

    public String getModel() {
        return Model;
    }
    
}
