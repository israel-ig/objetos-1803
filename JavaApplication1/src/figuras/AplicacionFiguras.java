
package figuras;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AplicacionFiguras {
    public static void main (String[] args) {
        
        try {
            //Primero creamos un objeto de tipo cuadrado
            Cuadrado c=new Cuadrado();
            
            //Ajustar el valor del lado
            ValidarValores.validarNoNegativo(4);
            c.setLado(4);
            
            //Generamos un objeto de tipo Calculos
            Calculos cal=new Calculos();
            System.out.println(cal.calcularArea(c)) ;
        } catch (ValorNegativoException ex) {
            System.out.println(ex.getMessage());
            
        }
    }
    
}
