/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Yen
 */
public abstract class Animal {
    
    public String name;
    public int age;
    public String food;
    public String gender;
    public int alive;
    
    abstract public String printSound();
    
    public String printData() {
        String str = getClass().getSimpleName() + "\n";
        str += "Name: " + name + "\n";
        str += "Age: " + age + "\n";
        str += "Food: " + food + "\n";
        str += "Gender: " + gender + "\n";
        str += "Alive: " + alive + "\n";
        return str;
    };
    
    public boolean isAlive(int alive) {
        return alive != 0;
    }
}
