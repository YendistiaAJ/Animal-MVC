/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Animal;
import model.Cat;
import model.ConstantsInterface;
import model.Dog;
import model.Duck;
import model.Horse;

/**
 *
 * @author Yen
 */
public final class Main implements ConstantsInterface{
    
    ArrayList<Animal> listAnimal = new ArrayList();
    
    public Main() {
        
        boolean exit = false;
        while (!exit) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog(ConstantsInterface.MAIN_MENU));             
                
            switch (menu) {
                case 1:
                    menuAddAnimal();
                    break;
                case 2:                        
                    menuPrintSound();
                    break;
                case 3:
                    menuIsAlive();
                    break;
                case 4:
                    menuPrintData();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, ConstantsInterface.ERROR_INVALID_OPTION, ConstantsInterface.ERROR, JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
    
    public static void main(String[] args) {
        new Main();
    }
    
    void menuAddAnimal() {
        boolean x = true;
        while (x) {
            int opsi = Integer.parseInt(JOptionPane.showInputDialog(ConstantsInterface.MENU_CHOOSE_ANIMAL));

            if (opsi >= 1 && opsi <= 4) {
                String name = JOptionPane.showInputDialog(ConstantsInterface.INPUT_NAMA);
                int age = Integer.parseInt(JOptionPane.showInputDialog(ConstantsInterface.INPUT_UMUR));
                String food = JOptionPane.showInputDialog(ConstantsInterface.INPUT_MAKANAN);
                String gender = JOptionPane.showInputDialog(ConstantsInterface.INPUT_GENDER);
                int alive = Integer.parseInt(JOptionPane.showInputDialog(ConstantsInterface.INPUT_ALIVE));

                switch(opsi) {
                    case 1:
                        Cat cat = new Cat(name, age, food, gender, alive);
                        listAnimal.add(cat);
                        break;
                    case 2:
                        Dog dog = new Dog(name, age, food, gender, alive);
                        listAnimal.add(dog);
                        break;
                    case 3:
                        Duck duck = new Duck(name, age, food, gender, alive);
                        listAnimal.add(duck);
                        break;
                    case 4:
                        Horse horse = new Horse(name, age, food, gender, alive);
                        listAnimal.add(horse);
                        break;
                }
                x = false;
            } else {
                JOptionPane.showMessageDialog(null, ConstantsInterface.ERROR_INVALID_OPTION, ConstantsInterface.ERROR, JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    void menuPrintSound() {
        Animal animal = menuChooseAnimal();
        JOptionPane.showMessageDialog(null, animal.printSound());
    }
    
    void menuIsAlive() {
        Animal animal = menuChooseAnimal();
        JOptionPane.showMessageDialog(null, animal.isAlive(animal.alive));
    }
    
    void menuPrintData() {
        Animal animal = menuChooseAnimal();
        JOptionPane.showMessageDialog(null, animal.printData());
    }
    
    Animal menuChooseAnimal() {
        StringBuilder str = new StringBuilder();
        str.append("Pilih hewan\n");
        for (int i = 0; i < listAnimal.size(); i++) {
            str.append(i+1).append(". ").append(listAnimal.get(i).name).append("\n");
        }
        int animal = Integer.parseInt(JOptionPane.showInputDialog(str));
        return listAnimal.get(animal-1);
    }
}