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
    
    public StringBuilder printData() {
        StringBuilder str = new StringBuilder();
        str.append(getClass().getSimpleName()).append("\n");
        str.append("Name: ").append(name).append("\n");
        str.append("Age: ").append(age).append("\n");
        str.append("Food: ").append(food).append("\n");
        str.append("Gender: ").append(gender).append("\n");
        str.append("Alive: ").append(alive).append("\n");
        return str;
    };
    
    public boolean isAlive(int alive) {
        return alive != 0;
    }
}
