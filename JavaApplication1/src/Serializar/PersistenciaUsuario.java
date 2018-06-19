
package Serializar;

import java.io.*;
public class PersistenciaUsuario {
    
    //Primero guardamos
    public static void guardar(Cliente c)throws  Exception{
        //paso uno es genrar el archivo donde se va guardar
        //nuestro serializado
        File file=new File("D:\\archivado.yomero");
        
        //paso 2 es indicar que lo vamos a generar para escribir en el 
        
        FileOutputStream fos=new FileOutputStream(file);
        
        //paso 3 escribir un objeto en el
        
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(c);
        oos.close();
    } 
}
