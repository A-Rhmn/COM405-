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
//this one belongs to the one done with arrays in the java 
//mainclass
public class Car_park {

    Car[] car;

    public Car_park(Car[] car) {
        this.car = new Car[15];
    }

    public boolean addCar(Car carIn) {
        for (int i = 0; i < car.length; i++) {
            if (car[i] == null) {
                car[i] = carIn;
                return true;
            }
        }
        return false;
    }

    public Car[] getCar() {
        return car;
    }

    public boolean removeCar(String registration_numIn){
        for( int i = 0; i < car.length; i++){
            if(car[i] == null){
                int registration_num = car[i].getRegistration_num();
                    car[i] = null;
                    return true;
                }
            
            }        return false;

        }         
      
    }
}
