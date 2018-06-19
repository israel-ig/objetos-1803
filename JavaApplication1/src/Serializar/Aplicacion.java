/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializar;

/**
 *
 * @author T-101
 */
public class Aplicacion {
    public static void main(String[] args) throws Exception{
        
        
       //Pues a usar nuetra modelo
       Cliente c=new Cliente();
       c.setEdad(25);
       c.setNombre("Israel");
       c.setSueldo(19000);
       
       PersistenciaUsuario.guardar(c);
        System.out.println("Guardado con exito!!");
        
    }
    
}
