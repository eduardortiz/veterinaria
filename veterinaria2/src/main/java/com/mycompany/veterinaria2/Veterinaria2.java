

package com.mycompany.veterinaria2;


public class Veterinaria2 {

    public static void main(String[] args) {
        
        //Creamos un objeto de la clase principal o padre (en este caso Pet se crea una mascota
        Pet mascota = new Pet();
        
        mascota.setCode(1);
        mascota.setBornYear(2019);
        mascota.setColor("Blanco");
        mascota.setName("Nena");
        mascota.setHealdStatus("Delicado");
        
        Pet felino = new Pet();
        
        felino.setCode(2);
        felino.setBornYear(2017);
        felino.setColor("Amarillo");
        felino.setName("Dragón");
        felino.setHealdStatus("Bien");
        
        System.out.println("Su mascotas es: "+mascota.getFullPet());
        System.out.println("Su mascotas es: "+felino.getFullPet());
        
        Pet felino1 = new Pet();
        
        felino1.setName("Manchas");
        felino1.setHealdStatus("Delicado");
        
        System.out.println("su mascota a sido ingresada "+ felino1.getName() + " " + felino1.getHealdStatus());
       
        Cat felinoNegro = new Cat (3, "Pantera", 2021, "Negro", "Fuerte");
        System.out.println("Su mascotas ingresada es: " + felinoNegro.getFullPet());
        
    }
}
