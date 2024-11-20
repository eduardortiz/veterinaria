
package com.mycompany.veterinaria2;

/**
 *
 * @author ASUS
 */
public class Dog extends Pet {
    private String breed;
    
    public Dog(){
    
    }
    public Dog(int code, String name, int bornYear, String color, String healdStatus){
        super(code, name, bornYear, color, healdStatus);
    }
    
    public String Sound(){
        return "Guau";
    }
}

