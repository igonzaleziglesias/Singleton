/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Usuario
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        newSingleton obx1 = newSingleton.Instanciar();
        newSingleton obx2 = newSingleton.Instanciar();
        obx1.setNombre("carlos");
        obx1.setApellido("Gomez");
        obx1.setDni("1");
        obx1.mostrar();
        obx2.setNombre("pedro");
        obx2.setApellido("Rodriguez");
        obx2.setDni("2");
        obx1.mostrar();
        obx2.mostrar();
    }
    
}
