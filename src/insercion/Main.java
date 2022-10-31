package insercion;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Insercion obj = new Insercion();
        
        // Setear numero de elementos
        obj.setNumElementos();
        
        // Llenar arreglo 
        obj.setElementos();
        
        // Ordenar arreglo por insercion
        obj.insercion();
        
        // Imprime arreglo
        obj.imprimeArreglo();
        
    }
}
