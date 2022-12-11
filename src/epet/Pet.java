/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package epet;

import java.util.Random;

/**
 *
 * @author d4ni3
 */
public class Pet {
    String name = "";
    int hunger = 0;
    int boredom = 0;
    int dirty = 0;
    int lifepoints = 5;
    int counter = 0;
    int thresh = 6;
    boolean grown = false;

    public Pet(String name){
        this.name = name;
    }
    public void newName(String str){
        this.name = str;
    }
    public void growUp(){
        lifepoints += 2;
        grown = true;
    }
    public void addCount(){
        counter++;
    }
    public int getCount(){
        return counter;
    }
    
    public int getDirty(){
        return dirty;
    }
    public int getHunger(){
        return hunger;
    }
    public void clean(){
        if (dirty > 0){
            dirty--;
        }
        if (boredom < thresh){
        boredom++;
        }
    }
    public void dying(){
        lifepoints--;
    }
 public void feed(){
     if (hunger > 0){
         hunger--;
     }
     
     if (boredom < thresh){
        boredom++;
        }
     if (dirty < thresh){
     dirty += chance();
     }
 }
 public void play(){
     if (boredom > 0){
     boredom--;
     }
     if (hunger < thresh){
        hunger++;
        }
     if (dirty < thresh){
     dirty ++;
     } 
     lifepoints -= chance();
 }
 public int getBoredom(){
     return boredom;
 }
 public String getName(){
     return name;
 }
 public int getLifepoints(){
     return lifepoints;
 }
 public int chance(){
     Random r = new Random();
     int chance = r.nextInt(5);
     if (chance == 3){
         return 1;
     } else {
         return 0;
     }
 }
}
