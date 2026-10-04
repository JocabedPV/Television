/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package television;

/**
 *
 * @author jocab
 */
public class Prueba {
    public static void main(String[] args) {
        Television tv1 = new Television();
        Television tv2 = new Television();
        Television tv3 = new Television();
        
        tv1.marca = "LG";
        tv1.pulgadas = 55;
        tv1.volumen = 30;
        tv1.canal = 11;
        
        tv2.marca = "Samsung";
        tv2.pulgadas = 65;
        tv2.volumen = 15;
        tv2.canal = 5;
        
        tv3.marca = "TCL";
        tv3.pulgadas = 82;
        tv3.volumen = 98;
        tv3.canal = 9;
        
        System.out.println("=====================");
        System.out.println("=== TELEVISION 1 ====");
        System.out.println("=====================");
        
        System.out.println("Marca: " + tv1.marca);
        System.out.println("Pulgadas: " + tv1.pulgadas);
        System.out.println("Volumen: " + tv1.volumen);
        
        tv1.encender();
        tv1.subirvolumen();
        tv1.bajarVolumen();
        tv1.cambiarCanal(15);
        tv1.apagar();
        
        System.out.println();
        
        System.out.println("=====================");
        System.out.println("=== TELEVISION 2 ====");
        System.out.println("=====================");
        
        System.out.println("Marca: " + tv2.marca);
        System.out.println("Pulgadas: " + tv2.pulgadas);
        System.out.println("Volumen: " + tv2.volumen);
        
        tv2.encender();
        tv2.subirvolumen();
        tv2.bajarVolumen();
        tv2.cambiarCanal(9);
        tv2.apagar();
        
        System.out.println();
        
        System.out.println("=====================");
        System.out.println("=== TELEVISION 3 ====");
        System.out.println("=====================");
        
        System.out.println("Marca: " + tv3.marca);
        System.out.println("Pulgadas: " + tv3.pulgadas);
        System.out.println("Volumen: " + tv3.volumen);
        
        tv3.encender();
        tv3.subirvolumen();
        tv3.subirvolumen();
        tv3.bajarVolumen();
        tv3.cambiarCanal(33);
        tv3.apagar();
        
        
        
    }
}
