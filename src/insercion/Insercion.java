package insercion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Insercion {
    private int[]arreglo;
    private int numElementos;
    private int pos;
    private int aux;
    
    public BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    public void setNumElementos() throws IOException {
        System.out.println("Ingresa el número de elementos del arreglo");
        numElementos = Integer.parseInt(bf.readLine());
        this.arreglo = new int[numElementos];
    }
    
    public void setElementos() throws IOException {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println((i + 1) + ".- Teclea un número: ");
            arreglo[i] = Integer.parseInt(bf.readLine());
        }
    }
    
    // Ordenamiento por insercion
    public void insercion() {
        for (int i = 0; i < arreglo.length; i++) {
            pos = i;
            aux = arreglo[i];
            
            while( pos > 0 && arreglo[pos - 1] > aux ) {
                arreglo[pos] = arreglo[pos - 1];
                pos--;
            }
            arreglo[pos] = aux;
        }
    }
    
    public void imprimeArreglo() {
        System.out.println("Arreglo ordenado: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] +  " - ");
        }
    }
    
    
}
