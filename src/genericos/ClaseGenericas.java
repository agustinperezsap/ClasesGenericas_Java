package genericos;

public class ClaseGenericas<T> {
    
    private T objeto;
    
    public ClaseGenericas(T objeto){
        this.objeto = objeto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
    }
    
}
