
package genericos;

/**
 *
 * @author T-101
 */
public class AplicacionPregunta {
    public static void main(String[] args) {
        
        GeneradorCuestionario generador=new GeneradorCuestionario();
 
        
        for(Pregunta p:generador.getCuestionario().getPreguntas()){
            
            System.out.println(p.getTitulo());
            
            for(Opcion o:p.getOpciones()){
                System.out.println(o.getTitulo()+" "+o.isCorrecta());
            }
        }
    }
}
