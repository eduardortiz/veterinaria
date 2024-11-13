
package com.mycompany.veterinaria2;

// Creamos la herencia de la clase Pet con la palabra extends y de el padre en este caso Pet
public class Cat extends Pet {
    
    private String breed;
    
    public void selfCleaning(){
        
    }
    // creamos un cosntructor vacio
    public Cat(){
    
    }
    
    
    //Creamos un constructor en la clase hija  con los parametros que tenemos en la clase padre para poder acceder a ellos
    //ejecutando el metodo super
    public Cat (int code, String name, int bornYear, String color, String healdStatus){
        super(code, name, bornYear, color, healdStatus);
    }
    
}
