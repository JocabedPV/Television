/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package television;

public class Television {
       String marca;
       int pulgadas;
       boolean encendido;
       int volumen;
       int canal;
       
    void encender() {
        if (encendido) {
            System.out.println("La televisión" + marca + "ya esta encendida");
            
        } else {
            encendido = true;
            System.out.println("Encendiendo la televisión...");
        }
    }
    
    void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("Apagando la televisión...");
            
        } else {
            System.out.println("La television " + marca + "ya esta apagada");
            
        }
    }
     
    void subirvolumen() {
        if (!encendido) {
            System.out.println("No puedes subir el volumen, la TV está apagada");
        } else if (volumen >= 100){
            System.out.println("El volumen esta al maximo");
        } else {
            volumen = volumen + 5;
            if (volumen > 100) {
                volumen = 100;
                
            }
            System.out.println("Subiendo el volumen... Volumen actual: " + volumen);
            
        }
    }
       void bajarVolumen() {
        if (!encendido) {
            System.out.println("No puedes bajar el volumen, la television esta apagada");
        } else if (volumen <=0){
            System.out.println("La television esta en silencio, volumen 0");
            
        } else {
            volumen = volumen - 5;
            if (volumen < 0) {
                volumen = 0;
            }
        } System.out.println("Bajando el volumen... Volumen actual "+ volumen);
        
    }
       
       void cambiarCanal(){
        if (encendido){
            canal = nuevoCanal;
            System.out.println("Cambiando al canal " + canal + "...");
        } else {
            System.out.println("Enciende primero la televisión para poder cambiar de canal");
        }     
    }
}
