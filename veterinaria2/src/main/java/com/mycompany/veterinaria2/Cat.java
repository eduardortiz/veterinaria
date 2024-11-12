
package com.mycompany.veterinaria2;

// Creamos la herencia de la clase Pet con la palabra extends y de el padre en este caso Pet
public class Cat extends Pet {
    
    private String breed;
    
    public void selfCleaning(){
        
    }
    public Cat (int code, String name, int bornYear, String color, String healdStatus){
        super(code, name, bornYear, color, healdStatus);
    }
    
}
