
package com.mycompany.veterinaria2;

/**
 *
 * @author ASUS
 */
public class Pet {
    private int code;
    private String name;
    private int bornYear;
    private String color;
    private String healdStatus; 
    
    //Generación de los geter y seter 
    public void Eat(){
        
    }
    public void Move(){
        
    }
    public String Sound(){
        return "Generico";
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBornYear() {
        return bornYear;
    }

    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHealdStatus() {
        return healdStatus;
    }

    public void setHealdStatus(String healdStatus) {
        this.healdStatus = healdStatus;
    }
    
    // creación de get que me muestra los datos completos en un solo metodo
    public String getFullPet(){
        return " El nombre de su mascota es : " + this.name 
                + " El Color de su mascota es : " + this.color 
                + " El estado de salud de su mascota es: " + this.healdStatus 
                + " El Año de nacimiento de su mascota es : " + this.bornYear;
    } 
    
    //creación de constructores para los objetos
    // constructor vasio para inicializar con sin datos básicos en el objeto
    public Pet() {
    }
    
    //contructor con los parametros 
    public Pet(int code, String name, int bornYear, String color, String healdStatus) {
        this.code = code;
        this.name = name;
        this.bornYear = bornYear;
        this.color = color;
        this.healdStatus = healdStatus;
    }
    
    //constructor con datos básicos para iniciar la atención de la mascota

    public Pet(String name, String healdStatus) {
        this.name = name;
        this.healdStatus = healdStatus;
    }
    
    
    
    
    
}
