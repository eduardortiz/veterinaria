/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    private String healdSatus; 
    
    //Generación de los geter y seter 
    public void Eat(){
        
    }
    public void Move(){
        
    }
    public void Sound(){
        
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

    public String getHealdSatus() {
        return healdSatus;
    }

    public void setHealdSatus(String healdSatus) {
        this.healdSatus = healdSatus;
    }
    
    // creación de get que me muestra los datos completos en un solo metodo
    public String getFullPet(){
        return " El nombre de su mascota es : " + this.name 
                + " El Color de su mascota es : " + this.color 
                + " El estado de salud de su mascota es: " + this.healdSatus 
                + " El Año de nacimiento de su mascota es : " + this.bornYear;
    } 
    
    //creación de constructores para los objetos
    // constructor vasio para inicializar con sin datos básicos en el objeto
    public Pet() {
    }
    
    //contructor con los parametros 
    public Pet(int code, String name, int bornYear, String color, String healdSatus) {
        this.code = code;
        this.name = name;
        this.bornYear = bornYear;
        this.color = color;
        this.healdSatus = healdSatus;
    }
    
    //constructor con datos básicos para iniciar la atención de la mascota

    public Pet(String name, String healdSatus) {
        this.name = name;
        this.healdSatus = healdSatus;
    }
    
    
    
    
    
}
